package org.calc;

/**
 * Hello world!
 *
 */
public class App 
{
	public long calculateAddition(long a, long b){
		long c = a+b;
		return c;
	}
	
	public long calculateSubtraction(long a, long b){
		long c = a-b;
		return c;
	}
	
	public static void main(String[] args) {
		App app= new App();
		long temp = app.calculateAddition(10, 20);
		System.out.println("Addition of a and b is: "+temp);
	}
	
}
