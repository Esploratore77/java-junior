package ru.amenshikov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
	@Test
	public void whenFirstGreaterThenSecondThenSecond() {
        Max maximum = new Max();
        assertThat(maximum.max(2,1), is(2));
    }
	@Test
	public void whenFirstLowerThenSecondThenSecond() {
        Max maximum = new Max();
        assertThat(maximum.max(1,2), is(2));
    }
}