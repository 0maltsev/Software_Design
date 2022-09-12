package ru.software.design.task1;

public class Rectangle extends Figure{
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public int getArea(){
        if (firstSide < 0 || secondSide < 0){
            throw new IllegalArgumentException("Сторона должна быть неотрицательной");
        }
        else {
            return firstSide * secondSide;
        }
    }
}
