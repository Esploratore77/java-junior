package ru.amenshikov;
public class Calculator {
	public double result;
	
	public void add(double first, double second) {
		this.result = first + second;
		
	}
	
	public void substruct(double first, double second) {
		this.result = first - second;
	}
	
	public void div(double first, double second) {
		this.result = first / second;
	}
	
	public void multiply(double first, double second) {
		this.result = first * second;
	}
}