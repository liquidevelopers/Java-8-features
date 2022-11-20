package com.vin.java.predefined.functional.inter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public  static void main(String[] args) {
		//Consumer<Integer> c = (t) -> System.out.println(t);
		//c.accept(10);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		list1.stream().forEach(t->System.out.println("print :"+t));
	}
	

}
