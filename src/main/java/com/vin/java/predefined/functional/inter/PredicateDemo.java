package com.vin.java.predefined.functional.inter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		/*
		 * Predicate<Integer> p = t -> t%2==0; System.out.println(p.test(5));
		 * 
		 * List<Integer> list1 = Arrays.asList(1,2,3,4,5); list1.stream().filter(p)
		 * .forEach(t->System.out.println("print :"+t));
		 */

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().filter(p -> p%2==0).forEach(t -> System.out.println("print :" + t));

	}

}
