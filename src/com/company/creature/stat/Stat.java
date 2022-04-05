package com.company.creature.stat;

public abstract class Stat {
    protected String name;
    protected int value;
    protected int initialValue;
    protected int maxValue = Integer.MAX_VALUE;
    protected int minValue = Integer.MIN_VALUE;

    protected Stat(String name, int value, int maxValue, int minValue) {
        this(name, value, maxValue);
        this.minValue = minValue;
    }

    protected Stat(String name, int value, int maxValue) {
        this(name, value);
        this.maxValue = maxValue;
    }

    protected Stat(String name, int value) {
        this.name = name;
        this.value = value;
        this.initialValue = value;
    }

    public void setInitialValue() {
        this.value = this.initialValue;
    }

    public void defineInitialValue(int value) {
        this.value = value;
        this.initialValue = value;
    }

    public void defineInitialValue(int value, int maxValue, int minValue) {
        this.value = value;
        this.initialValue = value;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }
}
