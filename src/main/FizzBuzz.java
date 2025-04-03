package main;

public class FizzBuzz {
	private int number = 0;
	
	public String next() {
		int buzz = ++number;	
		if((buzz)%3==0) {
			return "fizz";
		}
		return String.format("%d", buzz);
	}
}
