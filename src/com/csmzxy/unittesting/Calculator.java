package com.csmzxy.unittesting;

/**
 * �򵥼���������
 * 
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
	 * @param a
	 *            ��һ������
	 * @param b
	 *            �ڶ�������
	 * @return �ӷ����
	 */
	public int addInt(int a, int b) {
		return a + b;
	}

	/**
	 * 
	 * @param a
	 *            ��һ������
	 * @param b
	 *            �ڶ�������
	 * @return �������
	 */
	public int subInt(int a, int b) {
		return a - b;
	}

	/**
	 * 
	 * @param a
	 *            ��һ������
	 * @param b
	 *            �ڶ�������
	 * @return �˷����
	 */
	public int multiInt(int a, int b) {
		return a * b;
	}

	/**
	 * 
	 * @param a
	 *            ��һ������
	 * @param b
	 *            �ڶ�������
	 * @return �������
	 */
	public int divInt(int a, int b) {
		if (b != 0)
			return a / b; // ��������Ϊ0 bug
		else
			return 0;

	}

	/**
	 * �ж�����a��b��c�ܷ񹹳�������
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public String calculateTrangle(int a, int b, int c) {
		String result = null;
		if (a <= 0 || b <= 0 || c <= 0) {
			result = "a��b��cӦΪ��������";
		} else if (a + b <= c || b + c <= a || c + a <= b) {
			result = "��������";
		} else if (a == b && b == c) {
			result = "�ȱ�������";
		} else if (a == b || b == c || c == a) {
			result = "����������";
		} else {
			result = "һ��������";
		}
		return result;
	}

}
