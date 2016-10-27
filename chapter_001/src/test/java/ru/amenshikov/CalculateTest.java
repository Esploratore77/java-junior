package ru.amenshikov;
import java.io.ByteArrayOutputStream;
import org.junit.Test;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculateTest {
	@Test
	public void whenRunHWThenPrintToOut() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assertThat(out.toString(), is("Hello world"));
	}



}