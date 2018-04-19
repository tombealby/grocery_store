package model.costs;

import java.util.List;

/**
 * A calculation engine for shopping costs
 * @author Tom Bealby
 * @since 19.04.18
 *
 */
public interface CostCalculator {
	
	public int calculateCost(List<String> basket);

}
