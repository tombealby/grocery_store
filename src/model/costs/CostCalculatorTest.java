package model.costs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CostCalculatorTest {
	
	@Test
	public void test_calculateCost_no_offers(){

		List<String> basket = getBasket();
		CostCalculator costCalculator = new CostCalculatorNoOffersImpl();
		int cost = costCalculator.calculateCost(basket);
		Assert.assertEquals(205, cost);
	}
	
	@Test
	public void test_calculateCost_simple_offers(){
		
		List<String> basket = getBasket();
		CostCalculator costCalculator = new CostCalculatorSimpleOffersImpl();
		int cost = costCalculator.calculateCost(basket);
		Assert.assertEquals(145, cost);

		basket = getBiggerBasket();
		costCalculator = new CostCalculatorSimpleOffersImpl();
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
