package ru.software.design.task1;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public int getArea(){
        if (radius < 0){
            throw new IllegalArgumentException("Радиус должен быть неотрицательным");
        }
        else {
            return radius * radius * 3;
        }
    }
}
