import java.util.*;
import java.util.stream.Collectors;

public class Exer1_Declarative{
    public static void main(String[] hehaha){
        //declare tax rates
        Map<String, Double> taxRates = Map.of(
            "LOW", 0.05,
            "MID", 0.12,
            "HIGH", 0.20
        );
        //declare income list
        List<Double> incomes = Arrays.asList(8000.0, 20000.0, 45000.0);
        //declaratively compute results
        List<String> results = incomes.stream()
            .map(income -> {
                String rateType;
                double rate;
                
                if (income <= 10000){
                    rateType = "LOW";
                    rate = taxRates.get("LOW");
                }else if (income <= 30000){
                    rateType = "MID";
                    rate = taxRates.get("MID");
                }else{
                    rateType = "HIGH";
                    rate = taxRates.get("HIGH");
                }
                //computation of tax and total
                double tax = income * rate;
                double total = income - tax;

                return String.format(
                    "Income:\t %.2f \n Rate: \t %s (%.0f%%) \n Tax: \t %.2f \n Total:\t %.2f \n",
                    income, rateType, rate * 100, tax, total
                );
            })
            .collect(Collectors.toList());

        //display result
        results.forEach(System.out::println);
    }
}