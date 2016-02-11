package ru.yandex.rtriangle;

/**
 * Created by larina on 10.02.2016.
 */
public final class RtriangleProvider {

    public static Rtriangle getRtriangle(){

        return new Rtriangle() {

            Rtriangle triangle = new Triangle();

            public int getApexX1() {
                return triangle.getApexX1();
            }

            public int getApexY1() {
                return triangle.getApexY1();
            }

            public int getApexX2() {
                return triangle.getApexX2();
            }

            public int getApexY2() {
                return triangle.getApexY2();
            }

            public int getApexX3() {
                return triangle.getApexX3();
            }

            public int getApexY3() {
                return triangle.getApexY3(); }
        };
    }
}
