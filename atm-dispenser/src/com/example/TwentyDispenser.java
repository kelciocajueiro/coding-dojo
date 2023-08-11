package com.example;

public class TwentyDispenser extends CurrencyDispenser {

    public TwentyDispenser(CurrencyDispenser nextDispenser) {
        super.setNextDispenser(nextDispenser);
    }

    @Override
    public int getDispenserValue() {
        return DispenserType.TWENTY.getValue();
    }

}
