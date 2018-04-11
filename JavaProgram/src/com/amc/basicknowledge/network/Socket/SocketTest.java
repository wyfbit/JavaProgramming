package com.amc.basicknowledge.network.Socket;

import java.io.IOException;
import java.io.InputStream;
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
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
