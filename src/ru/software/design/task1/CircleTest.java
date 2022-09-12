package ru.software.design.task1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void PositiveArea(){
        Circle circle = new Circle(4);
        assertEquals(48, circle.getArea());
    }

    @Test
    public void ZeroArea(){
        Circle circle = new Circle(0);
        assertEquals(0, circle.getArea());
    }

    @Test
    public void NegativeArea(){
        Circle circle = new Circle(-1);
        assertThrows(IllegalArgumentException.class, circle::getArea);
    }

}
