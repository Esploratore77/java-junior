package ru.amenshikov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {
	@Test
	public void whenOneDigitThenSumOfOneDigit() {
        Counter counter = new Counter();
	assertThat(counter.add(1,3), is(2));
    }
	@Test
	public void whenCalculateThenCorrectSum() {
        Counter counter = new Counter();
	assertThat(counter.add(1,10), is(30));
    }

}