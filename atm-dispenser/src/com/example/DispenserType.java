package com.example;

public enum DispenserType {

    ONE_HUNDRED(100),
    FIFTY(50),
    TWENTY(20),
    TEN(10);

    private final int value;

    DispenserType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
