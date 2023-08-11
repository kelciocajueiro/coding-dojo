package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter amount to Withdraw (multiple of 10): ");
                int amount = scanner.nextInt();

                if (validate(amount)) {
                    System.out.printf("Withdrawal amount: $%d \n", amount);
                    Withdrawal.withdraw(new Currency(amount));
                }
            }
        }
    }

    private static boolean validate(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Try again!");
            return false;
        } else if (amount % 10 != 0) {
            System.out.println("Amount must be multiple of 10. Try again!");
            return false;
        }
        return true;
    }

}
