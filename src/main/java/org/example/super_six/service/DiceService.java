package org.example.super_six.service;

public class DiceService {
    public int roll() {
        return (int)(Math.random() * 6 + 1);
    }
}