package ru.amenshikov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {
	@Test
	public void whenCalculateThenFactorial() {
        Factorial factorial = new Factorial();
	assertThat(factorial.calculate(10), is(13628800));
    }

}