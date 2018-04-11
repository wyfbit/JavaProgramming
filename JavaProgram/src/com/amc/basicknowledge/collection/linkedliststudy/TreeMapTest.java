package com.amc.basicknowledge.collection.linkedliststudy;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * 
 * 项目名称：JavaProgram
 * 类名称：TreeMapTest
 * 类描述：
 * 创建人：wyfbit
 * 创建时间：2018年4月11日 下午2:33:47
 * 修改人：wyfbit
 * 修改时间：2018年4月11日 下午2:33:47
 * 修改备注：
 * @version 
 *
 */
public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Person,String> treeMap=new TreeMap<Person,String>(new Comparator<Person>(
				){
			@Override
			public int compare(Person o1, Person o2) {  
                return o1.getAge() - o2.getAge();  
            }  
		});
		
		Person p1 = new TreeMapTest().new Person("张三", 21);  
        Person p2 = new TreeMapTest().new Person("李四", 15);  
        Person p3 = new TreeMapTest().new Person("孙五", 26);  
        Person p4 = new TreeMapTest().new Person("赵六", 18);  
  
        treeMap.put(p1, "1");  
        treeMap.put(p2, "2");  
        treeMap.put(p3, "3");  
        treeMap.put(p4, "4");  
        System.out.println(treeMap); 
        p3.setAge(12);  
        System.out.println(treeMap); 
	}
	class Person {  
	    private String name;  
	    private int age;  
	  
	    public Person() {  
	    }  
	  
	    public Person(String name, int age) {  
	        this.name = name;  
	        this.age = age;  
	    }  
	  
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  
	    public int getAge() {  
	        return age;  
	    }  
	  
	    public void setAge(int age) {  
	        this.age = age;  
	    }  
	  
	    @Override  
	    public String toString() {  
	        return "name:" + name + "; age:" + age + "\n";  
	    }  
	  
	}  
}
