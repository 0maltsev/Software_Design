package ru.software.design.task1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void PositiveArea(){
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.getArea());
    }

    @Test
    public void ZeroAreaFirst(){
        Rectangle rectangle = new Rectangle(0, 3);
        assertEquals(0, rectangle.getArea());
    }

    @Test
    public void ZeroAreaSecond(){
        Rectangle rectangle = new Rectangle(2, 0);
        assertEquals(0, rectangle.getArea());
    }

    @Test
    public void NegativeAreaFirst(){
        Rectangle rectangle = new Rectangle(-1, 3);
        assertThrows(IllegalArgumentException.class, rectangle::getArea);
    }

    @Test
    public void NegativeAreaSecond(){
        Rectangle rectangle = new Rectangle(2, -1);
        assertThrows(IllegalArgumentException.class, rectangle::getArea);
    }

}