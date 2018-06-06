package com.amc.basicknowledge.algorithm.linkedreverse;

import java.util.concurrent.locks.ReentrantLock;

public class ReverseLinked {
	
	public Node head;
	//创建一个链表
	public void createLinkList(int[] x) {
		Node pnewNode;
		Node ptailNode=new Node();
		head=ptailNode;
		for(int i=0;i<x.length;i++){
			pnewNode=new Node();
			pnewNode.setData(x[i]);
			ptailNode.setNextNode(pnewNode);
			ptailNode=pnewNode;
		}
	}
	
	//正序输出链表的所有内容
	public void displayLinkList(){
		Node node=head.getNextNode();
		while(node!=null){
			System.out.print(node.getData()+"--->");
			node=node.getNextNode();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,1,3,0,5,6,7,8,9};
		ReverseLinked reverseLinked=new ReverseLinked();
		reverseLinked.createLinkList(a);
		reverseLinked.displayLinkList();
	}

}
