package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;
    private IFeline feline;

    public Lion(String sex, IFeline feline) throws Exception {
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
        this.feline = feline;
    }

    public int getKittens() {
        return this.feline.getKittens();
    }

    public boolean doesHaveMane() {
        return this.hasMane;
    }

    public List<String> getFood() throws Exception {
        return this.feline.getFood("Хищник");
    }

}
