package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param ???
     * @return ???
     *
     * P - an integer for the amount of money
     * R - an integer of the remaining balance after 3 months
     * E - Month 1
     *          Payment: 10% of 20000 = 2000
     *          Remaining amount: 18000
     *     Month 2
     *          Payment: 10% of 18000 = 1800
     *          Remaining amount: 16200
     *     Month 3:
     *          Payment: 10% of 16200 = 1620
     *          Remaining amount: 14580
     * P
     */

    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method

        double remainingAmount = amount;
        double monthlyPayment = 0.1 * amount;

         for(int i = 0; i < 3; i++) {
             remainingAmount -= monthlyPayment;
             monthlyPayment = 0.1 * remainingAmount;
        }

         return (int) remainingAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
