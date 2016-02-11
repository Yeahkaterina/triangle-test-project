package ru.yandex.triangle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.rtriangle.Rtriangle;
import ru.yandex.rtriangle.RtriangleProvider;
import ru.yandex.rtriangle.Triangle;

import java.awt.Point;
import java.util.Arrays;

/**
 * Created by larina on 10.02.2016.
 */
public class TriangleTest {

    Triangle rightTriangle;
    Point[] points;
    int [] sidesLength;
    int sumOfSquaresCathetus;
    int squareOfHypotenuse;

    @Before
    public void setTriangleVertices(){
        Point a = new Point(-3,-2);
        Point b = new Point(0,-1);
        Point c = new Point(-2,5);

        rightTriangle = new Triangle(a,b,c);
    }

    @Test
    public void is_triangle_right_test(){

        points = getCoordinatesOfTriangleVertices(rightTriangle);
        sidesLength = getTriangleSidesLenghtAndSort(points);

        sumOfSquaresCathetus = getSumOfSquaresCathetus(sidesLength);
        squareOfHypotenuse = getSquareOfHypotenuse(sidesLength);

        Assert.assertEquals("Method 'getRtriangle()' returned not right-angled triangle", squareOfHypotenuse, sumOfSquaresCathetus);
    }

    private Point[] getCoordinatesOfTriangleVertices(Triangle rTriangle) {

        Rtriangle result = RtriangleProvider.getRtriangle(rTriangle);
        return new Point[]{
                new Point(result.getApexX1(), result.getApexY1()),
                new Point(result.getApexX2(), result.getApexY2()),
                new Point(result.getApexX3(), result.getApexY3())
        };
    }

    private int[] getTriangleSidesLenghtAndSort(Point[] points) {
        Point aSide = points[0];
        Point bSide = points[1];
        Point cSide = points[2];

        int[] sides = new int[] {
                getSquareOfSideLenght(aSide, bSide),
                getSquareOfSideLenght(bSide, cSide),
                getSquareOfSideLenght(cSide, aSide)
        };

        Arrays.sort(sides);

        return sides;
    }

    private int getSquareOfSideLenght(Point aSide, Point bSide) {
        return (int) (Math.pow(aSide.distance(bSide), 2));
    }

    private int getSumOfSquaresCathetus(int[] sidesLength) {
        return sidesLength[0] + sidesLength[1];
    }

    private int getSquareOfHypotenuse(int[] sidesLength) {
        return sidesLength[2];
    }
}
