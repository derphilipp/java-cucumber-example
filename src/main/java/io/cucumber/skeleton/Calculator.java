package io.cucumber.skeleton;

public class Calculator {
    private int value;


    public void clear() {
        value =0;
    }

    public void add(int i){
        value +=i;
    }

    public int getValue() {
        return value;
    }

    public void multiply_by(int number) {
        value *=number;
    }
}
