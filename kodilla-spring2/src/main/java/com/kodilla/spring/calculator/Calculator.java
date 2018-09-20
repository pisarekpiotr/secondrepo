package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public final class Calculator {

    @Autowired
    private Display display;

    public void add(double a, double b) {
        double addResult = a + b ;
        display.displayValue(addResult);
    }

    public void sub(double a, double b){
        double subResult = a - b;
        display.displayValue(subResult);
    }

    public void mul(double a, double b) {
        double mulResult = a * b ;
        display.displayValue(mulResult);
    }

    public void div(double a, double b){
        double divResult = a / b ;
        display.displayValue(divResult);
    }

}
