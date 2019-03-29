package ru.avalon.java.dev.j10.labs.shapes;

import static java.lang.Math.*;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon  {
    
    private onePoint centerPoint;
    private onePoint edgePoint1;

    public Rectangle(onePoint centerPoint, onePoint edgePoint1) {
        this.centerPoint = centerPoint;
        this.edgePoint1 = edgePoint1;
    }
   
    
    @Override
    public float getArea() {
       return (4* abs(centerPoint.getX() - edgePoint1.getX()) * abs(centerPoint.getY() - edgePoint1.getY())); // area formula: 2*|x1-x2| * 2*|y1-y2| multiplication by to because center coordinate   
    }
    
    @Override
    public float getPerimeter() {
       return  (4*abs(centerPoint.getX() - edgePoint1.getX()
                        + abs(centerPoint.getY() - edgePoint1.getY()))); 
    }
        

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    public Point getCoordinateCentralPoint(){
           return new onePoint(centerPoint.getX(),centerPoint.getY());
    }
}
