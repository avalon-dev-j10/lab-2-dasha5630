package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(1f, 1f, 2f, 2f, 2f, 1f),
            new Rectangle(1f, 1f, 5f, 5f, 5f, 1f),
            new Rectangle(10f, 10f, 20f, 20f, 20f, 10f),
            new Rectangle(new OnePoint(10, 10), new OnePoint(15, 15), new OnePoint(10, 15)),
            new Triangle(new OnePoint(3, 4), new OnePoint(5, 8), new OnePoint(10, 15)),
            new Triangle(new OnePoint(30, 0), new OnePoint(50, 60), new OnePoint(70, 80)),
            new Triangle(new OnePoint(30, 40), new OnePoint(50, 80), new OnePoint(1000, 1500)),
            new Circle(15, new OnePoint(5, 8)),
            new Circle(30, new OnePoint(5, 8)),
            new Circle(40, new OnePoint(5, 8))
        };

        float maxArea = findeMaxArea(shapes);
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }

    public static float findeMaxArea(Shape[] shapes) {
        float maxArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (maxArea < shapes[i].getArea()) {
                maxArea = shapes[i].getArea();
            }
        }
        return maxArea;
    }
}
