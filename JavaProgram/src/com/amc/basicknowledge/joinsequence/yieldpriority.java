package com.amc.basicknowledge.joinsequence;

public class yieldpriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new T1();  
        Thread t2 = new T2();  
        Thread t3 = new T3();
        t1.setPriority(Thread.MIN_PRIORITY); //Min Priority  
        //t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY); //Max Priority  
  
        t1.start();  
        //t2.start(); 
        t3.start();
	}

}
class T1 extends Thread {  
    public void run() {  
        for (int i = 0; i < 5; i++) {  
            System.out.println("T1："+i);  
            Thread.yield();  
        }  
    }  
}  
  

class T2 extends Thread {  
    public void run() {  
        for (int i = 0; i < 5; i++) {  
            System.out.println("T2:"+i);  
            Thread.yield();  
        }  
    }  
}  
  
 
class T3 extends Thread {  
    public void run() {  
        for (int i = 0; i < 5; i++) {  
            System.out.println("T3："+i);  
            Thread.yield();  
        }  
    }  
}  

