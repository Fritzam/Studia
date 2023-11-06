package org.example;

public enum Klasa {
    PREMIUM(1), STANDARD(1.5), SPORT(3);

    private final double multiplier;

    Klasa(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
