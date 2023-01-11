package com.anggun.chapter5.tugas;

import java.util.Scanner;

public class exercises42_Financialapplicationfindthesalesamoun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double commission = 0.0, balance, salesAmount;

        // Let the user enter COMMISSION_SOUGHT
        System.out.print("Enter the commission sought: ");
        double commissionSought = input.nextDouble();

        for (salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01) {
            balance = commission = 0.0;
            if (salesAmount >= 10000.01)
                commission += (balance = salesAmount - 10000) * 0.12;
            if (salesAmount >= 5000.01)
                commission += (balance -= balance - 5000) * 0.10;
            if (salesAmount >= 0.01)
                commission += balance * 0.08;
        }
        System.out.printf("Minimum sales to earn $%.0f: $%.0f\n", commissionSought, salesAmount);
    }
}
/*(Financial application: find the sales amount) Rewrite Programming Exercise
5.39 as follows:
■ Use a for loop instead of a do-while loop.
■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.

 */