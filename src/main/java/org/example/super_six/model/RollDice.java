package org.example.super_six.model;

public class RollDice {

    private int outcome;

    public void roll() {
        this.outcome = (int)(Math.random() * 6 + 1);
    }

    public int getOutcome() {
        return outcome;
    }
}
