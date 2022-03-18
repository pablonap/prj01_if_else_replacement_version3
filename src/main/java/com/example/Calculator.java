package com.example;

import java.util.Arrays;

public class Calculator {
    public static double calculate(Cart cart) {
        Operator targetOperator = Arrays.stream(Operator.values())
                .filter(o -> cart.value() == o.getValue())
                .findFirst().orElseGet(() -> {return Operator.DEFAULT_VALUE;});
        return targetOperator.apply();
    }
}
