package org.example.super_six.model;

public class Bowl {
    int bowlHoleSticks[] = {0,0,0,0,0};

    public void getTotalHoleSticks() {
        for (int holeStick : bowlHoleSticks) {
            System.out.println(holeStick);
        }
    }

    public void addStick(int hole) {
        bowlHoleSticks[hole]=1;
    }

    public void restStick(int hole) {
        bowlHoleSticks[hole]=0;
    }
}
