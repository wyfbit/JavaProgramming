package com.amc.basicknowledge.proxyinstance;

import java.lang.reflect.InvocationHandler;

public class Client {
	public static void main(String[] args) {
		//我们要代理的真实对象
		Subject realSubject=new RealSubject();
		//我们要代理那个对象就将该对象传进去，最后是通过该真实对象来调用其方法的
		InvocationHandler handler=new DynamicProxy(realSubject);
		/*
		 * 通过proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
		 * 第一个参数：handler.getClass().getClassLoader(),我们这里使用handler这个类的classloader对象来加载我们的代理对象
		 */
	}
}
