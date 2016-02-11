package ru.yandex.triangle;

import org.junit.Assert;
import org.junit.Test;
import ru.yandex.rtriangle.Rtriangle;
import ru.yandex.rtriangle.RtriangleProvider;

import java.awt.Point;
import java.util.Arrays;

/**
 * Created by larina on 10.02.2016.
 */
public class TriangleTest {

    @Test
    public void is_triangle_rectangular_test(){

        Point[] points = getVerticesCoordinates();
        int [] sidesLength = getSortedSidesLengts(points);

        Assert.assertTrue("Method 'getRtriangle()' returned not right-angled triangle", isTriangleRectangular(sidesLength));
    }

    private boolean isTriangleRectangular(int[] sidesLength) {

        int sumOfSquaresCathetus = getSumOfSquaresCathetus(sidesLength);
        int squareOfHypotenuse = sidesLength[2];

        return (sumOfSquaresCathetus == squareOfHypotenuse) ? true : false;
    }

    private Point[] getVerticesCoordinates() {

        Rtriangle result = RtriangleProvider.getRtriangle();
        return new Point[]{
                new Point(result.getApexX1(), result.getApexY1()),
                new Point(result.getApexX2(), result.getApexY2()),
                new Point(result.getApexX3(), result.getApexY3())
        };
    }

    private int[] getSortedSidesLengts(Point[] points) {
        Point aSide = points[0];
        Point bSide = points[1];
        Point cSide = points[2];

        int[] sides = new int[] {
                getSquaredLenght(aSide, bSide),
                getSquaredLenght(bSide, cSide),
                getSquaredLenght(cSide, aSide)
        };

        Arrays.sort(sides);

        return sides;
    }

    private int getSquaredLenght(Point aSide, Point bSide) {
        return (int) (Math.pow(aSide.distance(bSide), 2));
    }

    private int getSumOfSquaresCathetus(int[] sidesLength) {
        return sidesLength[0] + sidesLength[1];
    }
}
