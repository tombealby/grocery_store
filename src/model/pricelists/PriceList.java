package model.pricelists;

import java.util.HashMap;
import java.util.Map;

import model.discounts.DiscountCalculatorBuyOneGetOneFreeImpl;
import model.discounts.DiscountCalculatorThreeForPriceOfTwoImpl;

/**
 * Represents a list for looking up the prices of goods.
 * @author Tom Bealby
 * @since 19.04.18
 *
 */
public class PriceList {
	
	public static Map<String, Integer> getPriceList() {
		//should priceList be a singleton?
		Map<String, Integer> priceList = new HashMap<String, Integer>();
		priceList.put("Apple", 60);
		priceList.put("Orange", 25);
		return priceList;
	}

	public static Map<String, PriceListDetail> getPriceListWithOffers() {
		//should priceList be a singleton?
		Map<String, PriceListDetail> priceList = new HashMap<String, PriceListDetail>();
		priceList.put("Apple", new PriceListDetail(60, new DiscountCalculatorBuyOneGetOneFreeImpl()));
		priceList.put("Orange", new PriceListDetail(25, new DiscountCalculatorThreeForPriceOfTwoImpl()));
		return priceList;
	}

}
