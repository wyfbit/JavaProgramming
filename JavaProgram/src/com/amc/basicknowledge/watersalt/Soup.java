package com.amc.basicknowledge.watersalt;

public class Soup {
	private boolean waterOk=false;//判断是否已经加好水，false为已经加好盐
	
	public synchronized void addWater(){
		waterOk=true;
		notifyAll();
	}
	
	public synchronized void addSalt(){
		waterOk=false;
		notifyAll();
	}
	
	public  synchronized void waitForWater() throws InterruptedException {
		while(waterOk==true){
			System.out.println("等待放水");
			wait();
		}
			
	}
	
	public synchronized void waitForSalt() throws InterruptedException{
		while(waterOk==false){
			System.out.println("等待放盐");
			wait();
		}
			
	}
}
