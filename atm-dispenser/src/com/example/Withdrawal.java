package com.example;

public class Withdrawal {

    protected static CurrencyDispenser dispenserChain;

    static {
        dispenserChain =
                new OneHundredDispenser(
                        new FiftyDispenser(
                                new TwentyDispenser(
                                        new TenDispenser(null))));
    }

    public static void withdraw(Currency currency) {
        if (currency != null) {
            dispenserChain.dispense(currency);
        }
    }

}
