package ru.software.design.task1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void PositiveArea(){
        Square square = new Square(2);
        assertEquals(4, square.getArea());
    }

    @Test
    public void ZeroArea(){
        Square square = new Square(0);
        assertEquals(0, square.getArea());
    }

    @Test
    public void NegativeArea(){
        Square square = new Square(-1);
        assertThrows(IllegalArgumentException.class, square::getArea);
    }
}