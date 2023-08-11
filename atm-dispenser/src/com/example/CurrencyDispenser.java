package com.example;

public abstract class CurrencyDispenser {

    protected DispenserType dispenserType;

    protected CurrencyDispenser nextDispenser;

    public void setNextDispenser(CurrencyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public void dispense(Currency currency) {
        if (currency !=  null) {
            int amount = currency.getAmount();
            int remainder = amount;

            if (amount >= getDispenserValue()) {
                int count = amount / getDispenserValue();
                remainder = amount % getDispenserValue();
                System.out.printf("Dispensing %d $%d currency note.\n", count, getDispenserValue());
            }

            if (remainder > 0 && this.nextDispenser != null) {
                this.nextDispenser.dispense(new Currency(remainder));
            }
        }
    }

    public abstract int getDispenserValue();

}
