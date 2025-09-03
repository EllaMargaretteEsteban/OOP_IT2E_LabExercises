import java.util.*;

public class Exer1_Imperative{
    public static void main(String[] hahehe){
        //incomes
        List<Double> incomes = Arrays.asList(8000.0, 20000.0, 45000.0);
        
        //imperative steps
        for (double income : incomes){
            String rateType;
            double rate;
            double tax;
            double total;

            //tax brackets
            if (income <= 10000){ //less than or equal 10,000 means low
                rateType = "LOW";
                rate = 0.05; //5%
            }else if (income <= 30000){ //30,000 means mid
                rateType = "MID";
                rate = 0.12; //12%
            }else{ //above 30,000 means high
                rateType = "HIGH";
                rate = 0.20; //20%
            }

            //tax computation
            tax = income * rate;
            total = income - tax;

            //dispay results
            System.out.println("Income: " + income);
            System.out.println("Rate: " + rateType + " (" + (rate * 100) + "%)");
            System.out.println("Tax: " + tax);
            System.out.println("Net Income: " + total);
            System.out.println();
        }
    }
}