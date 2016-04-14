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
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#multiInt(int, int)}.
	 */
	@Test
	public void testMultiInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#divInt(int, int)}.
	 */
	@Test
	public void testDivInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.csmzxy.unittesting.Calculator#calculateTrangle(int, int, int)}.
	 */
	@Test
	public void testCalculateTrangle() {
		fail("Not yet implemented");
	}

}
