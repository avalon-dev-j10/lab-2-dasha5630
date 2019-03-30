package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{

    private OnePoint point1;
    private OnePoint point2;
    private OnePoint point3;
    private int rotate = 0;
    
    public Triangle(OnePoint point1, OnePoint point2, OnePoint point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
        
    @Override
    public float getPerimeter() {
        return point1.distanceTo(point2) + point1.distanceTo(point3) + point2.distanceTo(point3);
    }

    @Override
    public float getArea() {
        return (float) (0.5*(point1.getX()-point3.getX())*(point2.getY() - point3.getY()) 
                - (point2.getX()-point3.getX())*(point1.getY() - point3.getY()));  
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
        
    public OnePoint getPoint1() {
        return point1;
    }

    public OnePoint getPoint2() {
        return point2;
    }

    public OnePoint getPoint3() {
        return point3;
    }



}
