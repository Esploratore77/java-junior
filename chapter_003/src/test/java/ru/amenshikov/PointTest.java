package ru.amenshikov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {
		
	@Test
	public void whenAddTwoPointCoordinatesThenResultLengthBetween()  {
		   Point pointFirst  = new Point(-1.0,-1.0);
	           Point pointSecond = new Point(2.0,2.0);
		   double lengthBetween = pointFirst.distanceTo(pointSecond);
		   assertEquals(4.24,lengthBetween,1e-2);
	} 
}