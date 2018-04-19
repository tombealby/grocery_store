package model;

public class PriceListDetail {

	final int price;
	final DiscountCalculator discountCalculator;

	public PriceListDetail(int price, DiscountCalculator discountCalculator){
		this.price = price;
		this.discountCalculator = discountCalculator;
	}

	public int getPrice() {
		return price;
	}

	public DiscountCalculator getDiscountCalculator() {
		return discountCalculator;
	}

}
