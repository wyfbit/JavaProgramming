package com.amc.basicknowledge.waitnotify;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Producer implements Runnable{
	
	private final Vector shareQueue;
	private final int SIZE;
	
	public Producer(Vector shareQueue,int size) {
		// TODO Auto-generated constructor stub
		this.shareQueue=shareQueue;
		this.SIZE=size;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<7;i++){
			System.out.println("Produced:"+i);
			try{
				produce(i);
			}catch(InterruptedException ex){
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE,null,ex);
			}
		}
	}
	private void produce(int i) throws InterruptedException{
		while (shareQueue.size()==SIZE) {
			synchronized (shareQueue) {
				System.out.println();
				shareQueue.wait();
			}
			
		}
		//producing element and notify consumers  
	    synchronized (shareQueue) {  
	        shareQueue.add(i);  
	        shareQueue.notifyAll();  
	    }  
	}
	
	

	
}
