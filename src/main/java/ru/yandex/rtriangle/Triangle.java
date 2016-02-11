package ru.yandex.rtriangle;

import java.awt.*;

/**
 * Created by larina on 11.02.2016.
 */
public class Triangle implements Rtriangle {

    int ApexX1;
    int ApexY1;
    int ApexX2;
    int ApexY2;
    int ApexX3;
    int ApexY3;

    public Triangle(Point a, Point b, Point c) {
        ApexX1 = a.x;
        ApexY1 = a.y;
        ApexX2 = b.x;
        ApexY2 = b.y;
        ApexX3 = c.x;
        ApexY3 = c.y;
    }

    public int getApexX1() {
        return ApexX1;
    }

    public int getApexY1() {
        return ApexY1;
    }

    public int getApexX2() {
        return ApexX2;
    }

    public int getApexY2() {
        return ApexY2;
    }

    public int getApexX3() {
        return ApexX3;
    }

    public int getApexY3() {
        return ApexY3;
    }
}
