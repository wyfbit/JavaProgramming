package com.amc.basicknowledge.mathbigdecimal;

import java.math.BigDecimal;

/**
 * @author HouPingPing
 *
 */
public class Arithmetic4Double {
	//默认除法运算精度
	private static final int DEF_DIV_SCALE=10;
	
	//所有方法均用静态方法实现，不允许实例化
	private Arithmetic4Double(){}
	
	/*
	 * 实现浮点数的加法实现，不允许实例化
	 * @param v1 加数1
	 * @param v2 加数2
	 * @return v1+v2的和
	 */
	public static double add(double v1,double v2){
		BigDecimal b1=new BigDecimal(Double.toString(v1));
		BigDecimal b2=new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}
	
	/*
	 * 实现浮点数的减法运算功能
	 * @param v1 被减数
	 * @param v2 减数
	 * @return v1-v2的差
	 */
	public static double sub(double v1,double v2){
		BigDecimal b1=new BigDecimal(Double.toString(v1));
		BigDecimal b2=new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}
	
	/*
	 * 实现浮点数的乘法运算功能
	 * @param v1 被乘数
	 * @param v2 乘数
	 * @return V1*V2的积
	 */
	public static double multi(double v1,double v2){
		BigDecimal b1=new BigDecimal(Double.toString(v1));
		BigDecimal b2=new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
		
	}
	
	/*
	 * 实现浮点数的除法运算功能
	 * 当发生除不尽的情况时，精确到小数点以后DEF_DIV_SCALE位（默认为10），后面的位数进行四舍五入。
	 * @param v1 被除数
	 * @param v2 除数
	 * @param v1/v2的商
	 */
	public static double div(double v1,double v2,int scale){
		if(scale<0){
			throw new IllegalArgumentException("The scale must be a positive integer or"
					+ "zero");
		}
		BigDecimal b1=new BigDecimal(Double.toString(v1));
		BigDecimal b2=new BigDecimal(Double.toString(v2));
		return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
			
}
