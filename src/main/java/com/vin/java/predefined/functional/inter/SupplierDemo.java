package com.vin.java.predefined.functional.inter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<String>{
//
//	@Override
//	public String get() {
//		return "hi Supplier";
//	}
//	
//	public static void main(String[] args) {
//		Supplier<String> supplier = new SupplierDemo();
//		System.out.println(supplier.get());
//	}
//}

public class SupplierDemo {
	// public static void main(String[] args) {
	// Supplier<String> supplier = () -> "Hi Supplier";
	// System.out.println(supplier.get());
	// }
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hi Supplier";
		List<String> list1 = Arrays.asList("a","b");
		System.out.println(list1.stream().findAny().orElseGet(supplier));
		
		//a
		List<String> list2 = Arrays.asList();
		System.out.println(list2.stream().findAny().orElseGet(supplier));
		
	}
}