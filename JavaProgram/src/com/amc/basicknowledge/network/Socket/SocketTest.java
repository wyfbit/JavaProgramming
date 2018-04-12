package com.amc.basicknowledge.network.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 
 * 项目名称：JavaProgram
 * 类名称：SocketTest
 * 类描述：
 * 创建人：wyfbit
 * 创建时间：2018年4月11日 下午5:23:48
 * 修改人：wyfbit
 * 修改时间：2018年4月11日 下午5:23:48
 * 修改备注：
 * @version 
 *
 */
public class SocketTest {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		try {
			Socket socket=new Socket();
			socket.connect(new InetSocketAddress("time-A.timefreq.bldrdoc.gov",13), 10000);
			/*"time-A.timefreq.bldrdoc.gov",13*/
			InputStream inputStream=socket.getInputStream();
			//socket.setSoTimeout(10000);
			Scanner in =new Scanner(inputStream);
			while(in.hasNext())
				System.out.println(in.nextLine());
				/*
				@Override
				public int read() throws IOException {
					// TODO Auto-generated method stub
					return 0;
				}
			};*/
			InetAddress[] address=InetAddress.getAllByName("www.baidu.com");
			for(int i=0;i<address.length;i++){
				System.out.println(address[i].getAddress().toString());
			}
			InetAddress addressLocal=InetAddress.getLocalHost();
			System.out.println(addressLocal.toString());
			/*byte[] ipAddress=address.getAddress();
			System.out.println(address.getAddress());*/
			Runnable runnable=new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
				}
			};
			
			System.out.println("**************************");
			//使用域名创建对象

            InetAddress inet1 = InetAddress.getByName("www.163.com");

            System.out.println(inet1);//www.baidu.com/119.75.216.20

            //使用IP创建对象

            InetAddress inet2 = InetAddress.getByName("127.0.0.1");

            System.out.println(inet2);

            //获得本机地址对象

            InetAddress inet3 = InetAddress.getLocalHost();

            System.out.println(inet3);
          //获得对象中存储的域名

            String host = inet3.getHostName();

            System.out.println("域名：" + host);

            //获得对象中存储的IP

            String ip = inet3.getHostAddress();

            System.out.println("IP:" + ip);


		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
