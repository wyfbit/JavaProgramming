package com.amc.basicknowledge.algorithm.sortalgorithm;

import com.sun.javafx.collections.SortableList;

public class FastSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello SortWorld！");
		int[] a={12,20,5,16,15,1,30,45,23,90};
		int start=0;
		int end=a.length-1;
		sort(a,start,end);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void sort(int[] a,int low,int high){
		int start=low;
		int end=high;
		int key=a[low];
		
		while(end>start){
			//从后往前比较
			while (end>start&&a[end]>=key) 
				end--;
				if(a[end]<=key){
					int temp=a[end];
					a[end]=a[start];
					a[start]=temp;
				}
				//从前往后比较
				while (end>start&&a[start]<=key) 
					start++;
					if(a[start]>=key){
						int temp=a[start];
						a[start]=a[end];
						a[end]=temp;
					}
		}
					//此时第一次循环比较结束，关键值的位置已经确定了。  ，右边的值都比关键值大，但是两边的书序还有可能是不一样的，进行下面的递归调用
					//递归
					if(start>low)
						sort(a, low, start-1);
					if(end<high)
						sort(a, end+1, high);
				
		}
	}
