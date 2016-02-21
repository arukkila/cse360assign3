/** 
 * @author Adric Rukkila, PIN 723, for CSE360 Spring 2016
 * @version 02.21.2016
 */

package cse360assign3;

public class Calculator 
{
	private int total;
	private String history;
	
	/**
	 * Basic calculator class where four operations can be performed on a value
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "" + total;
	}
	
	/**
	 * Returns the current total of all operations performed
	 * @return Returns an integer representing the current total of all operations performed
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Adds an integer to the current value
	 * @param value	Integer value to add
	 */
	public void add (int value) 
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts an integer from the current value
	 * @param value Integer value to subtract
	 */
	public void subtract (int value) 
	{
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Multiply the current value by an integer
	 * @param value Integer value to multiply by
	 */
	public void multiply (int value) 
	{
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * Divide the current value by an integer
	 * @param value Integer value to divide by
	 */
	public void divide (int value) 
	{
		// From the requirements:
		// The divide method should divide the total by the parameter. 
		// Use integer division. If the parameter is zero, set the total to zero. 
		// Do not print an error message.
		if (value != 0)
		{
			total /= value;
		}
		else
		{
			total = 0;
		}
		history += " / " + value;
	}
	
	/**
	 * Returns the history of all integer operations performed as a String
	 * @return String representation of all integer operations performed
	 */
	public String getHistory () 
	{
		return history;
	}
}
