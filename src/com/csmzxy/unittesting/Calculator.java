package com.csmzxy.unittesting;

/**
 * 简单计算器程序
 * @author Administrator
 *
 */
public class Calculator {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 
	 * @param a 第一个整数
	 * @param b 第二个整数
	 * @return 加法结果
	 */
	public int addInt(int a,int b){
		return a+b;
	}
	/**
	 * 
	 * @param a 第一个整数
	 * @param b 第二个整数
	 * @return 减法结果
	 */
	public int subInt(int a,int b){
		return a-b;
	}
	/**
	 * 
	 * @param a 第一个整数
	 * @param b 第二个整数
	 * @return 乘法结果
	 */
	public int multiInt(int a,int b){
		return a*b;
	}
	/**
	 * 
	 * @param a 第一个整数
	 * @param b 第二个整数
	 * @return 除法结果
	 */
	public int divInt(int a,int b){
		if (b!=0)
		  return a/b;   //除数不能为0 bug
		else
		  return 0;
		
	}
	/**
	 * 判定给定a、b、c能否构成三角形
	 * @param a 
	 * @param b
	 * @param c
	 * @return
	 */
	public String calculateTrangle(int a,int b,int c){
		return null;
	}

}
