package com.amc.basicknowledge.watersalt;

import java.util.concurrent.TimeUnit;

public class SaltAdd implements Runnable {
	private Soup soup;
	
	
	
	public SaltAdd(Soup soup) {
		//super();
		this.soup = soup;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(!Thread.interrupted()){
				soup.waitForSalt();
				System.out.println("SaltAdd on task!");
				TimeUnit.MILLISECONDS.sleep(230);
				soup.addSalt();
				soup.waitForWater();
			}
		}catch(InterruptedException e){
			System.out.println("Exsiting via interrupt!");
		}
		
		System.out.println("Ending SaltAdd task!");
	}

}
