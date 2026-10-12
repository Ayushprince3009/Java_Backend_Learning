package ecom.order.mgmt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiscountCalculatorTests {
	
	@Test //testcase for regualr
	public void testCalculateDiscountForRegular(){
		int expected = 900;
		
		DiscountCalculator calculator = new DiscountCalculator();
		int actual = calculator.calculateDisscount(1000, "REGULAR", 10);
		
		assertEquals(expected,actual);
	}
	
	@Test //testcase for gold
	public void testCalculateDiscountForGold(){
		int expected = 800;
		
		DiscountCalculator calculator = new DiscountCalculator();
		int actual = calculator.calculateDisscount(1000, "GOLD", 10);
		
		//assertEquals(expected,actual);
		
		assertEquals(expected, actual);
	}
	
	
}
