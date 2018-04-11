package com.amc.basicknowledge.collection.linkedliststudy;

import java.util.TreeSet;

/**
 * 
 * 项目名称：JavaProgram
 * 类名称：TreeSetTest
 * 类描述：底层由RBTree实现（1 所有节点都是
 * 红色或者黑色 2 根节点为黑色 3 所有NULL叶子节
 * 点都是黑色 4 如果该节点是红色的，那么该节点的子
 * 节点都是黑色 5 所有NULL节点到根节点的路径上的
 * 黑色节点个数一定相同）
 * 创建人：wyfbit
 * 创建时间：2018年4月10日 下午3:29:30
 * 修改人：wyfbit
 * 修改时间：2018年4月10日 下午3:29:30
 * 修改备注：
 * @version 
 *
 */
public class TreeSetTest {
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tsSet=new TreeSet<>();
		tsSet.add("D");
		tsSet.add("A");
		tsSet.add("E");
		tsSet.add("F");
		
		tsSet.add("B");
		tsSet.add("C");
		//System.out.println(tsSet);//[A, B, C, D, E, F]
		TreeSet tsSet1=new TreeSet<>();
		tsSet1.add("5");
		tsSet1.add("6");
		tsSet1.add("4");
		tsSet1.add("2");
		
		tsSet1.add("3");
		tsSet1.add("1");
		//System.out.println(tsSet1);//[1, 2, 3, 4, 5, 6]
		
		TreeSet tsSet2=new TreeSet<>();
		tsSet2.add("51");
		tsSet2.add("62");
		tsSet2.add("43");
		tsSet2.add("24");
		
		tsSet2.add("35");
		tsSet2.add("16");
		//System.out.println(tsSet2);//[16, 24, 35, 43, 51, 62]
		
		TreeSet tsSet3=new TreeSet<>();
		tsSet3.add(11);
		tsSet3.add(50);
		tsSet3.add(22);
		tsSet3.add(46);
		
		tsSet3.add(35);
		tsSet3.add(64);
		//System.out.println(tsSet3);//[16, 24, 35, 43, 51, 62]
		TreeSet<Student> ts=new TreeSet<Student>();    
		//TreeSetTest treeSetTest=new TreeSetTest();
        //创建元素对象  
		Student s1=new TreeSetTest(). new Student("zhangsan",20);  
        Student s2=new TreeSetTest().new Student("lis",22);  
        Student s3=new TreeSetTest().new Student("wangwu",24);  
        Student s4=new TreeSetTest().new Student("chenliu",26);  
        Student s5=new TreeSetTest().new Student("zhangsan",22);  
        Student s6=new TreeSetTest().new Student("qianqi",24);  
          
        //将元素对象添加到集合对象中  
        ts.add(s1);  
        ts.add(s2);  
        ts.add(s3);  
        ts.add(s4);  
        ts.add(s5);  
        ts.add(s6);  
		for(Student student:ts)
			System.out.println(student.name+"="+student.age);
		
		System.out.println("abg".compareTo("abcdefg"));
	}
	
	/**
	 * 
	 * 项目名称：JavaProgram
	 * 类名称：Student
	 * 类描述：
	 * 创建人：wyfbit
	 * 创建时间：2018年4月11日 上午11:00:42
	 * 修改人：wyfbit
	 * 修改时间：2018年4月11日 上午11:00:42
	 * 修改备注：
	 * @version 
	 *
	 */
	public class Student implements Comparable<Student>{  
	    private String name;  
	    private int age;  
	      
	    public Student() {  
	        super();  
	        // TODO Auto-generated constructor stub  
	    }     
	  
	    public Student(String name, int age) {  
	        super();  
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
		public int compareTo(Student s) {
			// TODO Auto-generated method stub
			//return -1; //-1表示放在红黑树的左边,即逆序输出  
	        //return 1;  //1表示放在红黑树的右边，即顺序输出  
	        //return o;  //表示元素相同，仅存放第一个元素  
			//主要条件 姓名的长度,如果姓名长度小的就放在左子树，否则放在右子树  
	        int num=this.name.length()-s.name.length(); 
	      //姓名的长度相同，不代表内容相同,如果按字典顺序此 String 对象位于参数字符串之前，则比较结果为一个负整数。  
	        //如果按字典顺序此 String 对象位于参数字符串之后，则比较结果为一个正整数。  
	        //如果这两个字符串相等，则结果为 0  
	        int num1=num==0?this.name.compareTo(s.name):num; 
	        int num2=num1==0?this.age-s.age:num1;  
			return num2;
		}  
	}  
}
