package org.example.super_six.service;

public class BowlService {
    int bowlHoleSticks[] = {0,0,0,0,0};

    public void addStick(int hole) {
        bowlHoleSticks[hole]=1;
    }

    public void restStick(int hole) {
        bowlHoleSticks[hole]=0;
    }
}
