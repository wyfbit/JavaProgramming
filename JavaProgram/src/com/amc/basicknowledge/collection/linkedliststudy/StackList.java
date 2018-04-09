package com.amc.basicknowledge.collection.linkedliststudy;

import java.util.Iterator;
import java.util.LinkedList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * 
 * 项目名称：JavaProgram
 * 类名称：StackList
 * 类描述：使用LinkedList模拟堆栈的数据结构存储方式
 * 创建人：wyfbit
 * 创建时间：2018年4月9日 下午6:22:10
 * 修改人：wyfbit
 * 修改时间：2018年4月9日 下午6:22:10
 * 修改备注：https://blog.csdn.net/oguro/article/details/53414265
 * @version 
 *
 */
public class StackList {
	LinkedList linkedList;
	
	/**
	 * 构造函数
	 */
	public StackList() {
		linkedList=new LinkedList();
	}
	
	//进栈
	public void add(Object o) {
		linkedList.push(o);
	}
	//弹栈
	public Object pop(){
		return linkedList.pop();
	}
	//获取元素个数
	public int size() {
		return linkedList.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackList stackList=new StackList();
		stackList.add(3);
		stackList.add(2);
		stackList.add(1);
		int size=stackList.size();
		for(int i=0;i<size;i++){
			System.out.println(stackList.pop());
		}
	}

}
