package model.costs;

import java.util.List;
import java.util.Map;

import model.pricelists.PriceList;

/**
 * Calculates the cost of a basket of goods assuming that no
 * offers can be applied to those good.
 * @author Tom Bealby
 * @since 19.04.18
 *
 */
public class CostCalculatorNoOffersImpl implements CostCalculator {

	@Override
	public int calculateCost(List<String> basket) {
		int totalCost = 0;
		Map<String, Integer> priceList = PriceList.getPriceList();
		for (String item: basket) {
			totalCost += priceList.get(item);
		}
		return totalCost;
	}

}
