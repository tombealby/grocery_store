package model;

import junit.framework.*;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class CostCalculatorTest {
	
	@Test
	public void test_calculateCost(){
		
		List<String> basket = getBasket();
		CostCalculator costCalculator = new CostCalculatorSimpleImpl();
		int cost = costCalculator.calculateCost(basket);
		Assert.assertEquals(205, cost);
		
	}

	private List<String> getBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Orange");
		basket.add("Apple");
		return basket;
	}

}
