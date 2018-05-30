package com.amc.basicknowledge.synchronizedobject;

import java.math.BigDecimal;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<3;i++){
			Thread thread=new MyThread();
			thread.start();
		}*/
		byte a=1;
		byte b=127;
		//b=a+b;
		b+=a;//+= 隐式的将加操作的结果类型强制转换为持有结果的类型
		System.out.println(b);
		System.out.println(3*0.1);
		System.out.println(0.3);
		System.out.println(3*0.1==0.3);
		System.out.println(System.getProperty("sun.arch.data.model")); 
		double d1=2.07;
		System.out.println(d1);
		double d2=1.03;
		System.out.println(d2);
		System.out.println(d1+d2);
		BigDecimal b1=new BigDecimal(Double.toString(d1));
		System.out.println(b1);
		BigDecimal b2=new BigDecimal(Double.toString(d2));
		System.out.println(b2);
		System.out.println(b1.add(b2));
		
	}

}
