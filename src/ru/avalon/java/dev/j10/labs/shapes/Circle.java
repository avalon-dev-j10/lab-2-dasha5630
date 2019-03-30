package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    
    private float radius;
    OnePoint centerPoint;
    
    @Override
    public float getArea() {
        return Shape.pi*radius*radius;
    }

    @Override
    public float getLength() {
        return 2*radius;
    }

    public float getRadius() {
        return radius;
    }

    public OnePoint getCenterPoint() {
        return centerPoint;
    }

    public Circle(float radius, OnePoint centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }
}
