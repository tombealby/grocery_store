package model;

import java.util.HashMap;
import java.util.Map;

public class PriceList {
	
	public static Map<String, Integer> getPriceList() {
		//should priceList be a singleton?
		Map<String, Integer> priceList = new HashMap<String, Integer>();
		priceList.put("Apple", 60);
		priceList.put("Orange", 25);
		return priceList;
		
	}

}
