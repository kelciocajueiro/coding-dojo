package com.example;

public class OneHundredDispenser extends CurrencyDispenser {

    public OneHundredDispenser(CurrencyDispenser nextDispenser) {
        super.setNextDispenser(nextDispenser);
    }

    @Override
    public int getDispenserValue() {
        return DispenserType.ONE_HUNDRED.getValue();
    }

}
