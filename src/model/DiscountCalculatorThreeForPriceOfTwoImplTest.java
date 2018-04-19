package model;

import org.junit.Test;

import junit.framework.Assert;

public class DiscountCalculatorThreeForPriceOfTwoImplTest {

	@Test
	public void test_calculateCost(){

		DiscountCalculator discountCalculator =
				new DiscountCalculatorThreeForPriceOfTwoImpl();
		int itemPrice = 50;
		int intemQuantity = 5;
		int cost = discountCalculator.calculateCost(itemPrice, intemQuantity);
		Assert.assertEquals(200, cost);

		itemPrice = 50;
		intemQuantity = 4;
		cost = discountCalculator.calculateCost(itemPrice, intemQuantity);
		Assert.assertEquals(150, cost);

		itemPrice = 0;
		intemQuantity = 4;
		cost = discountCalculator.calculateCost(itemPrice, intemQuantity);
		Assert.assertEquals(0, cost);

		itemPrice = 40;
		intemQuantity = 0;
		cost = discountCalculator.calculateCost(itemPrice, intemQuantity);
		Assert.assertEquals(0, cost);
	}
}
