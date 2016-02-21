/**
 * Unit tests for Calculator class
 * @author Adric Rukkila, PIN 723, for CSE360 Spring 2016
 * @version 02.21.2016
 */
package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{
	/**
	 * Test method for {@link cse360assign3.Calculator#Calculator()}.
	 */
	@Test
	public final void testCalculator() 
	{
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#getTotal()}.
	 */
	@Test
	public final void testGetTotal() 
	{
		// Should be initialized to 0
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#add(int)}.
	 */
	@Test
	public final void testAdd() 
	{
		Calculator calc = new Calculator();
		
		calc.add(5);
		assertEquals(5, calc.getTotal());
		
		calc.add(-1);
		assertEquals(4, calc.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#subtract(int)}.
	 */
	@Test
	public final void testSubtract() 
	{
		Calculator calc = new Calculator();
		
		calc.subtract(5);
		assertEquals(-5, calc.getTotal());
		
		calc.subtract(-1);
		assertEquals(-4, calc.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#multiply(int)}.
	 */
	@Test
	public final void testMultiply() 
	{
		Calculator calc = new Calculator();
		
		calc.add(2);
		assertEquals(2, calc.getTotal());
		
		calc.multiply(5);
		assertEquals(10, calc.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#divide(int)}.
	 */
	@Test
	public final void testDivide() 
	{
		Calculator calc = new Calculator();
		
		calc.add(10);
		assertEquals(10, calc.getTotal());
		
		calc.divide(5);
		assertEquals(2, calc.getTotal());
		
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}

	/**
	 * Test method for {@link cse360assign3.Calculator#getHistory()}.
	 */
	@Test
	public final void testGetHistory() 
	{
		Calculator calc = new Calculator();

		assertEquals("0", calc.getHistory());
		
		calc.add(18);
		calc.subtract(2);
		calc.multiply(2);
		calc.divide(4);
		assertEquals("0 + 18 - 2 * 2 / 4", calc.getHistory());
	}

}
