/**
 * 
 */
package com.csmzxy.unittesting;

import static org.junit.Assert.*;

import org.junit.After;
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
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
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
		assertEquals(1-2,cal.subInt(1, 2));
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#multiInt(int, int)}.
	 */
	@Test
	public void testMultiInt() {
		assertEquals(1*2,cal.multiInt(1, 2));
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#divInt(int, int)}.
	 */
	@Test
	public void testDivInt() {
		assertEquals(4/2,cal.divInt(4, 2));
		cal.divInt(10, 0);
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#calculateTrangle(int, int, int)}.
	 */
	@Test
	public void testCalculateTrangle() {
		assertEquals("a��b��cӦΪ��������",cal.calculateTrangle(-1, 0, 2));
		assertEquals("��������",cal.calculateTrangle(2, 6, 9));
		assertEquals("�ȱ�������",cal.calculateTrangle(6, 6, 6));
		assertEquals("����������",cal.calculateTrangle(5, 8, 8));
		assertEquals("һ��������",cal.calculateTrangle(3, 4, 5));
	}

}
