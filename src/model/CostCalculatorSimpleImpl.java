package model;

import java.util.List;
import java.util.Map;

public class CostCalculatorSimpleImpl implements CostCalculator {

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
