package ru.avalon.java.dev.j10.labs.shapes;

import static java.lang.Math.*;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы прямые (равны 90
 * градусам).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    private OnePoint edgePoint1;
    private OnePoint edgePoint2;
    private OnePoint edgePoint3;
    private int rotate = 0;

    public Rectangle(OnePoint edgePoint1, OnePoint edgePoint2, OnePoint edgePoint3) {
        this.edgePoint1 = edgePoint1;
        this.edgePoint2 = edgePoint2;
        this.edgePoint3 = edgePoint3;

    }

    public Rectangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.edgePoint1 = new OnePoint(x1, y1);
        this.edgePoint2 = new OnePoint(x2, y2);
        this.edgePoint3 = new OnePoint(x3, y3);

    }

    @Override
    public float getArea() {
        return edgePoint1.distanceTo(edgePoint2) * edgePoint2.distanceTo(edgePoint3);
    }

    @Override
    public float getPerimeter() {
        return 2 * (edgePoint1.distanceTo(edgePoint2)
                + (edgePoint1.distanceTo(edgePoint2)));
    }

    int getRotation(int rotation) {
        if (rotation > 360) {
            this.rotate = rotation % 360;
        } else if (rotation < 0) {
            this.rotate = 360 - rotation % 360;
        } else {
            this.rotate = rotation;
        }
        return this.rotate;
    }

    public OnePoint getEdgePoint1() {
        return edgePoint1;
    }

    public OnePoint getEdgePoint2() {
        return edgePoint2;
    }

    public OnePoint getEdgePoint3() {
        return edgePoint3;
    }

}
