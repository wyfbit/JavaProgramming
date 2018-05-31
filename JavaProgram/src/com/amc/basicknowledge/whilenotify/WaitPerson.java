package com.amc.basicknowledge.whilenotify;

public class WaitPerson implements Runnable{
	
	private Restaurant restaurant;
	
	
	public WaitPerson(Restaurant restaurant) {
		this.restaurant=restaurant;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				//如果容器中肉的数量少于1，则挂起服务员线程
				synchronized (this) {
					while(restaurant.count<=1){
						wait();
					}
				}
				System.out.println("服务员拿走了一块肉，容器中还有 "+restaurant.count-- +" 块");
				
				//获取restaurant.chef的锁进行同步控制
				synchronized (restaurant.chef) {
					restaurant.chef.notifyAll();
				}
				
			}
		}catch(InterruptedException e){
			System.out.println("服务员线程被中断");
		}
	}
	
}
