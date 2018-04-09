package com.amc.basicknowledge.collection.linkedliststudy;

import java.util.LinkedList;
@SuppressWarnings({"rawtypes","unchecked"})
public class QueueList {
	
	LinkedList linkedList;
	
	public QueueList() {
		linkedList=new LinkedList();
	}
	
	public void add(Object o){
		linkedList.offer(o);
	}
	
	public Object remove(){
		return linkedList.poll();
	}
	
	public int size(){
		return linkedList.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueList queueList=new QueueList();
		queueList.add(3);
		queueList.add(2);
		queueList.add(1);
		int size=queueList.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(queueList.remove());
		}
	}

}
