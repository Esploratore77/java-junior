package ru.amenshikov;

public class Max {
	public int max(int first, int second, int third){
        int maxOfFirstSecond = first > second ? first : second;
        return maxOfFirstSecond > third ? maxOfFirstSecond : third;
	}

	
}