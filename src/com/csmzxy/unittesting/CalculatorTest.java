/**
 * 
 */
package com.csmzxy.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class CalculatorTest {

	static Calculator cal;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#addInt(int, int)}.
	 */
	@Test
	public void testAddInt() {
		assertEquals(1+2,cal.addInt(1, 2));
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#subInt(int, int)}.
	 */
	@Test
	public void testSubInt() {
		assertEquals(4-2,cal.subInt(4, 2));
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#multiInt(int, int)}.
	 */
	@Test
	public void testMultiInt() {
		assertEquals(2*2,cal.multiInt(2, 2));
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#divInt(int, int)}.
	 */
	@Test
	public void testDivInt() {
		cal.divInt(12, 0);
		assertEquals(6/2,cal.divInt(6, 2));
	}
	
	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#calculateTrangle(int, int,int)}.
	 */
	@Test
	public void testCalculateTrangle() {
		
		assertEquals("���������߱���Ϊ��������",cal.calculateTrangle(0, -1, 4));
		assertEquals("���ܹ��������Σ�",cal.calculateTrangle(1, 2, 3));
		assertEquals("һ�������Σ�",cal.calculateTrangle(3, 4, 5));
		assertEquals("���������Σ�",cal.calculateTrangle(6, 6, 10));
		assertEquals("�ȱ������Σ�",cal.calculateTrangle(8, 8, 8));
		
	}
	

}
