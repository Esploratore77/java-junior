package ru.amenshikov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenAddCorrectPointsThenBuildTriangle() {
        Point a = new Point(0.0,0.0);
        Point b = new Point(0.0,2.0);
        Point c = new Point(3.0,0.0);
        Triangle triangle = new Triangle(a,b,c);
        assertEquals(3.00,triangle.area(),1e-2);
    }

    @Test
    public void whenAddIncorrectPointsThenAreaZero() {
        Point a = new Point(0.0,0.0);
        Point b = new Point(1.0,0.0);
        Point c = new Point(2.0,0.0);
        Triangle triangle = new Triangle(a,b,c);
        assertEquals(0.00,triangle.area(),1e-2);        
    }
}