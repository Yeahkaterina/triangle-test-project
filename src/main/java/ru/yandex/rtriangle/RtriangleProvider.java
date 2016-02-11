package ru.yandex.rtriangle;

/**
 * Created by larina on 10.02.2016.
 */
public final class RtriangleProvider {

    public static Rtriangle getRtriangle(final Triangle pTriangle){

        return new Rtriangle() {

            public int getApexX1() {
                return pTriangle.getApexX1();
            }

            public int getApexY1() {
                return pTriangle.getApexY1();
            }

            public int getApexX2() {
                return pTriangle.getApexX2();
            }

            public int getApexY2() {
                return pTriangle.getApexY2();
            }

            public int getApexX3() {
                return pTriangle.getApexX3();
            }

            public int getApexY3() { return pTriangle.getApexY3(); }
        };
    }
}
