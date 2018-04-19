package model.costs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.discounts.DiscountCalculator;
import model.pricelists.PriceList;
import model.pricelists.PriceListDetail;

/**
 * Calculates the cost of a basket of goods assuming that simple
 * offers can be applied to those good.
 * @author Tom Bealby
 * @since 19.04.18
 *
 */
public class CostCalculatorSimpleOffersImpl implements CostCalculator {

	@Override
	public int calculateCost(List<String> basket) {
		int totalCost = 0;
		Map<String, Integer> nameQuantityMap = new HashMap<>();
		for (String item: basket) {
			if (nameQuantityMap.containsKey(item)) {
				Integer num = nameQuantityMap.get(item);
				nameQuantityMap.put(item, ++num);
			} else {
				nameQuantityMap.put(item, 1);
			}
		}

		Map<String, PriceListDetail> priceList = PriceList.getPriceListWithOffers();
		for (Map.Entry<String, Integer> entry : nameQuantityMap.entrySet()) {
			PriceListDetail priceListDetail = priceList.get(entry.getKey());
			DiscountCalculator discountCalculator = priceListDetail.getDiscountCalculator();
			int itemPrice = priceListDetail.getPrice();
			int intemQuantity = entry.getValue();
			totalCost += discountCalculator.calculateCost(itemPrice, intemQuantity);
		}
		return totalCost;
	}

}
