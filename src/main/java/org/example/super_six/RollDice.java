package org.example.super_six;

public class RollDice {

    private int outcome;

    public int getOutcome() {
        return (int)(Math.random() * 6 + 1);
    }
}
