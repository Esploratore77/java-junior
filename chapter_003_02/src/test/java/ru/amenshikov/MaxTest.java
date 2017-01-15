package ru.amenshikov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
	@Test
	public void whenFirstGreaterThenSecondAndThirdThenThird() {
        Max maximum = new Max();
        assertThat(maximum.max(3,1,2), is(3));
    }
	@Test
	public void whenSecondGreaterThenFirstAndThirdThenSecond() {
        Max maximum = new Max();
        assertThat(maximum.max(1,3,2), is(3));
    }
	@Test
	public void whenThirdGreaterThenFirstAndSecondThenThird() {
        Max maximum = new Max();
        assertThat(maximum.max(1,2,3), is(3));
    }
}