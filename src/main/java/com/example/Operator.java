package com.example;

public enum Operator {
    VALUE_SIX (6.0) {
        @Override
        public double apply() {
            return 6.0 * 1.5;
        }
    },
    VALUE_SEVEN (7.0) {
        @Override
        public double apply() {
            return 7.0 * 2.5;
        }
    },
    DEFAULT_VALUE (1.5) {
        @Override
        public double apply() {
            return 1.5;
        }
    };

    private final Double value;

    Operator(double value) {
        this.value = value;
    }

    public Double getValue() {
        return this.value;
    }

    public abstract double apply();
}
