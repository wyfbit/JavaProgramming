package com.amc.basicknowledge.waitnotify;

import java.util.Vector;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector shareQueue=new Vector();
		int size=4;
		Thread prodThread=new Thread(new Producer(shareQueue, size),"Producer");
		Thread consThread=new Thread(new Consumer(shareQueue, size),"COnsumer");
		prodThread.start();
		consThread.start();
	}

}
