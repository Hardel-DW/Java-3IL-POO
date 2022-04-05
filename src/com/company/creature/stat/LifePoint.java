package com.company.creature.stat;

public class LifePoint extends Stat {
    public LifePoint(int value, int maxValue) {
        super("LifePoint", value, maxValue);
    }

    public LifePoint(int value) {
        super("LifePoint", value, value);
    }
}
