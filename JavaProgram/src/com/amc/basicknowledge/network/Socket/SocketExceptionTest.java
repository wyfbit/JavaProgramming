package com.amc.basicknowledge.network.Socket;

import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/**
 * 
 * 项目名称：JavaProgram
 * 类名称：SocketExceptionTest
 * 类描述：
 * 创建人：wyfbit
 * 创建时间：2018年4月12日 下午3:44:11
 * 修改人：wyfbit
 * 修改时间：2018年4月12日 下午3:44:11
 * 修改备注：
 * @version 
 *
 */
public class SocketExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoString="www.163.com";
		int port=80;
		if(args.length>1) {
			hoString=args[0];
			port=Integer.parseInt(args[0]);
		}
		new SocketExceptionTest().connect(hoString, port);
	}
	
	public void connect(String host,int port) {
		SocketAddress address=new InetSocketAddress(host, port);
		Socket socket=null;
		String result="";
	
		try {
			long begin=System.currentTimeMillis();//计算开始连接的时间
			socket=new Socket();
			socket.connect(address, 10000);//设置连接超时时间
			long end=System.currentTimeMillis();//计算机连接结束的时间
			result =(end-begin)+"ms";
			
		}catch(BindException e) {
			result="IP地址或端口绑定异常！";
		}catch(UnknownHostException e){
			result="未识别主机地址！";
		} catch (SocketTimeoutException e) {
			// TODO Auto-generated catch block
			result="连接超时！";
		}catch (ConnectException e) {
			// TODO: handle exception
			result="拒绝连接！";
		}catch (Exception e) {
			// TODO: handle exception
			result="失败啦！";
		}finally {
			if(socket!=null) {
				try {
					socket.close();
				}catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
		System.out.println("远程地址信息==>"+address+":"+result);
	}
	
}
