package model.discounts;

public class DiscountCalculatorThreeForPriceOfTwoImpl implements DiscountCalculator {

	@Override
	public int calculateCost(int itemPrice, int intemQuantity) {

		int numberOfTripletsOfItemsBought = intemQuantity / 3;
		int remainingSingleItem = intemQuantity % 3;
		return ((numberOfTripletsOfItemsBought * 2) + remainingSingleItem) * itemPrice;
	}

}
