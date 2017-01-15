package ru.amenshikov;

public class Factorial {
	public int calculate(int digit) {
		int even = 1;
		for (int i = 1; i <= digit; i++) {
			even = even * i;
        	}
		return even;
	}

}