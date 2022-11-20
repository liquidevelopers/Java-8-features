package com.vin.java.functionalinterface.demo;
interface Calculator {
	//void switchOn();
	//void sum(int a)
	int subtract(int a, int b);
}
public class LamdaExamples {

	public static void main(String[] args) {
		/*Calculator calculator = () -> System.out.println("Switch on");
		calculator.switchOn();*/
		
		/*
		 * Calculator calculator = (a) -> System.out.println("hello:"+a);
		 * calculator.sum(0);
		 */
		Calculator calculator = (a,b)-> b-a;
		System.out.println(calculator.subtract(5,9));
	}


}
