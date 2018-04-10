package com.amc.basicknowledge.collection.linkedliststudy;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


/**
 * 
 * 项目名称：JavaProgram
 * 类名称：HashTableTest
 * 类描述： for循环一般用来处理比较简单的有序的，可预知大小的集合或数组
*foreach可用于遍历任何集合或数组，而且操作简单易懂，他唯一的不好就是需要了解集合内部类型
*iterator是最强大的，他可以随时修改或者删除集合内部的元素，并且是在不需要知道元素和集合的
 *类   型的情况下进行的（原因可参考第三点：多态差别），当你需要对不同的容器实现同样的遍历方式时，
 *迭代器是最好的选择！
 * 创建人：wyfbit
 * 创建时间：2018年4月10日 上午11:17:13
 * 修改人：wyfbit
 * 修改时间：2018年4月10日 上午11:17:13
 * 修改备注：
 * @version 
 *
 */
public class HashTableTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Integer> dicHashTable=new Hashtable<String,Integer>();
		System.out.println(dicHashTable.getClass());
		System.out.println(dicHashTable.hashCode());
		dicHashTable.put("语文", 96);
		System.out.println(dicHashTable.hashCode());
		dicHashTable.put("数学", 69);
		dicHashTable.put("英语", 31);
		System.out.println("第一种遍历方式：迭代器方式");
		Iterator iterator=dicHashTable.keySet().iterator();
		while(iterator.hasNext()) {
			String entry=(String)iterator.next();
			System.out.println(entry+"="+dicHashTable.get(entry));
		}
		
		System.out.println("第二种遍历方式");
		for(Iterator<Entry<String,Integer>> iterator1=dicHashTable.entrySet().iterator();iterator1.hasNext(); ) {
			Entry<String,Integer> entry=iterator1.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println("第三种遍历方式");
		for(Map.Entry<String,Integer> entry : dicHashTable.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		System.out.println("第四种遍历方式");
		Enumeration<String> enumeration=dicHashTable.keys();
		while(enumeration.hasMoreElements()) {
			String key=enumeration.nextElement();
			System.out.println(key+"="+dicHashTable.get(key));
		}
		
		System.out.println("第五种遍历方式");
		Enumeration<String> enumeration1=dicHashTable.keys();
		while (enumeration1.hasMoreElements()) {
			String string = (String) enumeration1.nextElement();
			System.out.println(string);
		}
	}

}
