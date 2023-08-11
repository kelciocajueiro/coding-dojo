package com.example;

public class TenDispenser extends CurrencyDispenser {

    public TenDispenser(CurrencyDispenser nextDispenser) {
        super.setNextDispenser(nextDispenser);
    }

    @Override
    public int getDispenserValue() {
        return DispenserType.TEN.getValue();
    }

}
