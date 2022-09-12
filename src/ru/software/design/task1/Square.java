package ru.software.design.task1;

public class Square extends Figure{
    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public int getArea() {
        if (side < 0){
            throw new IllegalArgumentException("Сторона должна быть неотрицательной");
        }
        else {
            return side * side;
        }
    }
}
