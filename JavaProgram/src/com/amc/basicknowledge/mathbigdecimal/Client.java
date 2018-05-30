package com.amc.basicknowledge.mathbigdecimal;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v1=2.07;
		double v2=1.03; 
		System.out.println(Arithmetic4Double.add(v1, v2));
		System.out.println(Arithmetic4Double.sub(v1, v2));
		System.out.println(Arithmetic4Double.multi(v1, v2));
		System.out.println(Arithmetic4Double.div(v1, v2, 10));
		System.out.println(Arithmetic4Double.div(v1, 1, 10));
		int[] a={1,2,3};
		System.out.println(a.length);
	}

}
