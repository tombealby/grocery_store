package model.discounts;

/**
 * An engine for calculating the cost of goods items when discounts
 * might be applied to those items.
 * @author Tom Bealby
 * @since 19.04.18
 *
 */
public interface DiscountCalculator {

	public int calculateCost(int itemPrice, int intemQuantity);

}
