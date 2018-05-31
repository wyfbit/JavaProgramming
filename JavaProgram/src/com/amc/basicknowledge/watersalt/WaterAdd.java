package com.amc.basicknowledge.watersalt;

import java.util.concurrent.TimeUnit;

public class WaterAdd implements Runnable {
	private Soup soup;
	
	
	public WaterAdd(Soup soup) {
		//super();
		this.soup = soup;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				soup.waitForWater();
				System.out.println("WaterAdd on task");
				TimeUnit.MILLISECONDS.sleep(313);
				soup.addWater();
			}
		}catch(InterruptedException e){
			System.out.println("Exsiting via interrupt!");
		}
	}

}
