import java.util.*;
import java.util.function.Function; //imports the function utility

public class Exer1_Functional{
    public static void main(String[] heheha){
        //rate of tax
        Map<String, Double> taxRates = Map.of(
            "LOW", 0.05,
            "MID", 0.12,
            "HIGH", 0.20
        );
        //calculate function, returns String and Double
        Function<Double, String> taxCalculator = income -> {
            String rateType;
            double rate;
            double tax;

            if (income <= 10000){ //if income is lessthan or equal 10,000 then low
                rateType = "LOW";
                rate = taxRates.get("LOW"); //gets the rate of low which is 0.005
            }else if (income <= 30000){ //30,000 means mid
                rateType = "MID";
                rate = taxRates.get("MID");//rate of mid
            }else{ //above 30,000 means high
                rateType = "HIGH";
                rate = taxRates.get("HIGH");//rate of high
            }

            tax = income * rate; //calculate income x rate
            double total = income - tax; //total = income - tax

            return "Income:\t" + income + "\n"
                 + "Rate: \t" + rateType + ", " + (rate * 100) + "% \n" //high,mid,low and calculates rate x 100 = percentile
                 + "Tax: \t" + tax + "\n"
                 + "Total: \t" + total + "\n";
        };

        //incomes
        List<Double> incomes = Arrays.asList(8000.0, 20000.0, 45000.0);

        //apply function to each income
        incomes.stream()
               .map(taxCalculator)
               .forEach(System.out::println);
    }
}