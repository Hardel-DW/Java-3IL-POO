package com.company.creature.stat;

public abstract class Stat {
    protected String name;
    protected int value;
    protected int initialValue;
    protected int maxValue = Integer.MAX_VALUE;
    protected int minValue = Integer.MIN_VALUE;

    // Constructor
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

    // Method
    public void addValue(Properties properties, int value) {
        switch (properties) {
            case VALUE -> this.addValue(value);
            case MAX_VALUE -> this.maxValue += value;
            case MIN_VALUE -> this.minValue += value;
        }
    }

    public void subValue(Properties properties, int value) {
        switch (properties) {
            case VALUE -> this.subValue(value);
            case MAX_VALUE -> this.maxValue -= value;
            case MIN_VALUE -> this.minValue -= value;
        }
    }

    public void setValue(Properties properties, int value) {
        switch (properties) {
            case VALUE -> this.setValue(value);
            case MAX_VALUE -> this.setMaxValue(value);
            case MIN_VALUE -> this.setMinValue(value);
        }
    }

    // Set all values to initial values
    public void redefineOriginalValue() {
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

    // Operators
    private void addValue(int value) {
        this.value += value;
        if (this.value > this.maxValue) {
            this.value = this.maxValue;
        }
    }

    private void subValue(int value) {
        this.value -= value;
        if (this.value < this.minValue) {
            this.value = this.minValue;
        }
    }

    // Getters and setters
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
