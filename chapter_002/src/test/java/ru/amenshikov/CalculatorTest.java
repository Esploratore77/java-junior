package ru.amenshikov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest {
		
	@Test
	public void whenAddOperationThenResultAddNumbers()  {
		   Calculator calculator = new Calculator();
		   calculator.add(15.0,5.0);
		   assertThat(calculator.result, is(20.0));
	}
	
	@Test
        public void whenSubstructOperationThenResultSubstructNumbers()  {
		   Calculator calculator = new Calculator();
		   calculator.substruct(15.0,5.0);
		   assertThat(calculator.result, is(10.0));
	}

	@Test
        public void whenDivOperationThenResultDivNumbers()  {
		   Calculator calculator = new Calculator();
		   calculator.div(15.0,5.0);
		   assertThat(calculator.result, is(3.0));
	}

	@Test
        public void whenMultiplyOperationThenResultMultiplyNumbers()  {
		   Calculator calculator = new Calculator();
		   calculator.multiply(15.0,5.0);
		   assertThat(calculator.result, is(75.0));
	}


}