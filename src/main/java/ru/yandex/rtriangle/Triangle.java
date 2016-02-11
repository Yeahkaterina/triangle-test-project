package ru.yandex.rtriangle;

import java.awt.*;

/**
 * Created by larina on 11.02.2016.
 */
public class Triangle implements Rtriangle {

    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();

    public Triangle() {
        this.a = new Point(-3,-2);
        this.b = new Point(0,-1);
        this.c = new Point(-2,5);
    }

    public int getApexX1() {
        return a.x;
    }

    public int getApexY1() {
        return a.y;
    }

    public int getApexX2() {
        return b.x;
    }

    public int getApexY2() {
        return b.y;
    }

    public int getApexX3() {
        return c.x;
    }

    public int getApexY3() {
        return c.y;
    }
}
