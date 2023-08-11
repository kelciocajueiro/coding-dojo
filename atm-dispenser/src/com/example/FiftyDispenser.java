package com.example;

public class FiftyDispenser extends CurrencyDispenser {

    public FiftyDispenser(CurrencyDispenser nextDispenser) {
        super.setNextDispenser(nextDispenser);
    }

    @Override
    public int getDispenserValue() {
        return DispenserType.FIFTY.getValue();
    }

}
