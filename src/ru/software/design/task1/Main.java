package ru.software.design.task1;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(3);
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(6, 4);


            System.out.println("Площадь квадрата " + square.getArea() + "\n" +
                    "Площадь круга " + circle.getArea() + "\n" +
                    "Площадь прямоугольника " + rectangle.getArea() + "\n");
    }
}
