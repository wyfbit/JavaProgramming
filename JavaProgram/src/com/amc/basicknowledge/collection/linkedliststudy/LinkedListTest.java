package com.amc.basicknowledge.collection.linkedliststudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * 项目名称：JavaProgram
 * 类名称：linkedlisttest
 * 类描述：
 * 创建人：wyfbit
 * 创建时间：2018年4月9日 下午5:49:45
 * 修改人：wyfbit
 * 修改时间：2018年4月9日 下午5:49:45
 * 修改备注：abcdefghijklmnopqrstuvwxyz.
 * @version 
 *
 */
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("语文: 1");
		list.add("数学: 2");
		list.add("英语: 3");
		
		list.addFirst("狗蛋: 4");
		list.addLast("狗剩: 5");
		
		System.out.println("获取首要位置元素： "+list.getFirst());
		System.out.println("获取末尾位置元素："+list.getLast());
		System.out.println("删除集合中的首位置元素并返回："+ list.removeFirst());
		System.out.println("删除集合中的末尾素并返回："+ list.removeLast()); 

		
		list.push("狗蛋： 01");
		System.out.println("删除集合的首元素："+list.pop()); // 移除并返回集合中的第一个元素  
		System.out.println("删除集合的首元素: "+list.poll()); 
		list.offer("狗剩： 7");
		System.out.println("集合中的元素："+ list); 
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
	
	

}
