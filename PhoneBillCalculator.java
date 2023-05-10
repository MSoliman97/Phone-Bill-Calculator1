package Chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double overAgeChargePerCent = .25;
    static double taxPercent = .15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // what we need
        double Plan = getPlan();
        int overageMinutes = getOverageMinutes();
        scanner.close();
        double overage = overageMinutes * overAgeChargePerCent;
        double subTotal = getSubTotal(overage , Plan);
        double Tax = getTaxCalculation(subTotal); 
        double Total = getTotal(subTotal, Tax);
        // calculate the total
        System.out.println("Your Bill Statement");
        System.out.println("Plan:" + Plan);
        System.out.println("Overage:" + overage);
        System.out.println("Tax:" + String.format("%.2f", Tax));
        System.out.println("Total:" + String.format("%.2f",Total));
    }
    public static double getPlan (){
        System.out.println("Enter base cost of the plan");
        double plan = scanner.nextDouble();
        return plan;
    }
    public static int getOverageMinutes (){
        System.out.println("Enter overage minutes");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }
    public static double getSubTotal(double overage , double Plan){
        double subTotal = overage + Plan;
        return subTotal;
    }
    public static double getTaxCalculation(double subtotal){
        double Tax = subtotal * taxPercent;
        return Tax;
    }
    public static double getTotal (double subtotal, double Tax){
        double Total = subtotal + Tax;
        return Total;
    }

}
