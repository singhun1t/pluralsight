package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    public double karat;

    public Jewelry(String name, double value, double karat) {
        super("jewelry", 0);
        this.karat = karat;
    }

    @Override
    public double getValue(){
        double baseValue = 0;
        double karatValue = karat * 1000;
        return baseValue + karatValue;
    }
}
