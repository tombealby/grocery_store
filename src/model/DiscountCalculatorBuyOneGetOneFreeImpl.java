package model;

public class DiscountCalculatorBuyOneGetOneFreeImpl implements DiscountCalculator {

	@Override
	public int calculateCost(int itemPrice, int intemQuantity) {
		int numberOfPairsOfItemsBought = intemQuantity / 2;
		int remainingSingleItem = intemQuantity % 2;
		return (numberOfPairsOfItemsBought + remainingSingleItem) * itemPrice;
	}
}
