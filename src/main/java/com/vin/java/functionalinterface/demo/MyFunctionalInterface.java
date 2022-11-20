package com.vin.java.functionalinterface.demo;
public interface MyFunctionalInterface {
	
	public void m1();

	default void m2() {
		System.out.println("default one");
	}
	default void m3() {
		System.out.println("default two");
	}
	static void m4() {
		System.out.println("static m4");
	}
	static void m5() {
		System.out.println("static m5");
	}
}
