package com.amc.basicknowledge.synchronizedobject;

public class Sync {
	//static方法
	/*
	public static synchronized void test(){
		System.out.println("test开始...");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("test结束...");
	}
	*/
	//锁class对象
	public void test(){
		synchronized (Sync.class) {
			System.out.println("test开始...");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("test结束...");
		}
		
	}
}
