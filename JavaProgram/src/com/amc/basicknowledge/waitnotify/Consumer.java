package com.amc.basicknowledge.waitnotify;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable{
	private final Vector shareQueue;
	private final int SIZE;
	
	public Consumer(Vector shareQueue,int size){
		this.shareQueue=shareQueue;
		this.SIZE=size;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try{
				System.out.println("Consumer: "+consume());
				Thread.sleep(50);
			}catch(InterruptedException ex){
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE,null,ex);
			}
		}
	}
	
	private int consume() throws InterruptedException{
		while(shareQueue.isEmpty()){
			synchronized (shareQueue) {
				System.out.println("Queue is empty "+Thread.currentThread().getName()+"is waiting ,size:"+shareQueue.size());
				shareQueue.wait();
			}
		}
		synchronized(shareQueue){
			shareQueue.notifyAll();
			return (Integer)shareQueue.remove(0);
		}
	}
	
	
	
}
