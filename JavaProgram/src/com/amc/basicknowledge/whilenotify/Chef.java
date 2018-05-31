package com.amc.basicknowledge.whilenotify;

//厨师类
public class Chef implements Runnable{
	private Restaurant restaurant;
	
	public Chef(Restaurant restaurant){
		this.restaurant=restaurant;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				synchronized (this) {
					//如果容器中肉过多 则挂起厨师线程
					while(restaurant.count>=restaurant.N){
						wait();
					}
				}
				System.out.println("厨师制作了一块肉，容器中还有"+restaurant.count++ +" 块肉");
			}
			//获取restaurant.person的锁进行同步控制
			synchronized (restaurant.person) {
				restaurant.person.notifyAll();
				
			}
		}catch(InterruptedException e){
			System.out.println("厨师线程中断");
		}
	}
	
	
}
