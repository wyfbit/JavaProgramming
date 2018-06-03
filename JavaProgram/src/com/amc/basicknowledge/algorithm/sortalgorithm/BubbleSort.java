package com.amc.basicknowledge.algorithm.sortalgorithm;

/*
 * 冒泡排序
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,3,8,2,9,1,1,-1};
		bubbleSort(arr);
		for(int num:arr) {
			System.out.println(num);
		}
	}
	
	public static void bubbleSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {//外层循环控制排序趟数
			for(int j=0;j<a.length-1-i;j++) {//内层循环控制每一趟排序多少次
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
	}
}
