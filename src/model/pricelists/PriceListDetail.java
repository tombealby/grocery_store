package model.pricelists;

import model.discounts.DiscountCalculator;

/**
 * Represents a line in a price list when that price list contains
 * more information than simple a 'goods item name' -> price mapping.
 * For example the price list might contain a third column being the
 * type of discount that applies to the goods item.
 * @author Tom Bealby
 * @since 19.04.18
 *
 */
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
