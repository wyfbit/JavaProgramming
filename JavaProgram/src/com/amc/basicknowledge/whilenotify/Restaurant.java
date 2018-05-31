package com.amc.basicknowledge.whilenotify;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Restaurant {
	final static int N=10;//容器的容量
	int count =0;//计数器 
	
	//厨师
	Chef chef=new Chef(this);
	//服务员
	WaitPerson person=new WaitPerson(this);
	ExecutorService service=Executors.newCachedThreadPool();
	
	public Restaurant() {
		service.execute(chef);
		service.execute(person);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new Restaurant();
		//3S后退出
		TimeUnit.SECONDS.sleep(15);
		System.exit(0);
	}

}
