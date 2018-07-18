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
	
//	@Test
//	public void test_calculateCost_bananas(){
//		
//		List<String> basket = getBananaBasket();
//		CostCalculator costCalculator = new CostCalculatorSimpleOffersImpl();
//		int cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(20, cost);
//		
//	}
	
//	@Test
//	public void test_calculateCost_apples_and_bananas(){
//		
//		List<String> basket = getAppleAndBananaBasket();
//		CostCalculator costCalculator = new CostCalculatorSimpleOffersImpl();
//		int cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(120, cost);
//
//		basket = get3AppleAnd4BananaBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(200,cost);
//		
//		basket = get3AppleAnd2BananaBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(180,cost);
//		
//		basket = get3AppleAnd1BananaBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(120,cost);
//		
//		basket = get3AppleAnd2BananaOrangeBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(205,cost);
//		
//		basket = get1AppleAnd2BananaBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(80,cost);
//		
//		basket = get1AppleAnd3BananaBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(80,cost);
//		
//		basket = get1AppleAnd4BananaBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(100,cost);
//		
//		basket = get1AppleAnd5BananaBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(100,cost);
//		
//		basket = get6BananaBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(60,cost);
//		
//		basket = get6AppleBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(180,cost);
//		
//		basket = get7AppleBasket();
//		costCalculator = new CostCalculatorSimpleOffersImpl();
//		cost = costCalculator.calculateCost(basket);
//		Assert.assertEquals(240,cost);
//	}

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
	
	private List<String> getBananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Banana");
		return basket;
	}
	
	private List<String> getAppleAndBananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Banana");
		basket.add("Banana");
		return basket;
	}
	
	private List<String> get3AppleAnd4BananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		return basket;
	}
	
	private List<String> get3AppleAnd2BananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Banana");
		basket.add("Banana");
		return basket;
	}
	
	private List<String> get3AppleAnd1BananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Banana");
		return basket;
	}
	
	private List<String> get3AppleAnd2BananaOrangeBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Orange");
		return basket;
	}
	
	private List<String> get1AppleAnd2BananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Banana");
		basket.add("Banana");
		return basket;
	}
	
	private List<String> get1AppleAnd3BananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		return basket;
	}
	
	private List<String> get1AppleAnd4BananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		return basket;
	}

	private List<String> get1AppleAnd5BananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		return basket;
	}
	
	private List<String> get6BananaBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		basket.add("Banana");
		return basket;
	}
	
	private List<String> get6AppleBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		return basket;
	}

	private List<String> get7AppleBasket() {
		List<String> basket = new ArrayList<>();
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		basket.add("Apple");
		return basket;
	}
}
