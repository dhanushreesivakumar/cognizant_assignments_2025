package financialforecasting;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecast {
	 private Map<Integer, Double> memo = new HashMap<>();

	    // Recursive function to compute future value
	    public double futureValue(double initialAmount, double growthRate, int years) {
	        if (years == 0) return initialAmount;

	        if (memo.containsKey(years)) return memo.get(years);

	        double value = futureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
	        memo.put(years, value);
	        return value;
	    }
}
