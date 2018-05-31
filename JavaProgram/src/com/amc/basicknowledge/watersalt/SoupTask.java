package com.amc.basicknowledge.watersalt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SoupTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Soup soup=new Soup();
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new SaltAdd(soup));
		exec.execute(new WaterAdd(soup));
		
		TimeUnit.SECONDS.sleep(5);
		exec.shutdownNow();
	}

}
