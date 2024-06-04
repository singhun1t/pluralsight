package com.pluralsight.finance;

import com.pluralsight.interfaces.Valuable;

public abstract class FixedAsset implements Valuable {
    private String name;
    protected double value;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


   public abstract double getValue();

    public void setValue(double value) {
        this.value = value;
    }
}
