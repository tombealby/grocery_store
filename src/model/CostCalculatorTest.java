package model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CostCalculatorTest {
	
	@Test
	public void test_calculateCost(){
		
		List<String> basket = getBasket();
		CostCalculator costCalculator = new CostCalculatorSimpleImpl();
		int cost = costCalculator.calculateCost(basket);
		Assert.assertEquals(145, cost);

		basket = getBiggerBasket();
		costCalculator = new CostCalculatorSimpleImpl();
		cost = costCalculator.calculateCost(basket);
		Assert.assertEquals(220, cost);
		
	}

	private List<String> getBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Orange");
		basket.add("Apple");
		return basket;
	}

	private List<String> getBiggerBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Orange");
		basket.add("Apple");
		basket.add("Orange");
		basket.add("Orange");
		basket.add("Orange");
		basket.add("Orange");
		return basket;
	}

}
