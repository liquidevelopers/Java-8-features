package com.vin.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("vinay");
		list.add("Kumar");
		list.add("Advaith");
		list.add("Sruthi");
		list.add("Karimnagar");
		list.add("Hyderabad");
		
		//--filter example
		for(String s : list ) {
			if(s.startsWith("K")) {
				System.out.println(s);
			}
		}
		
		list.stream().filter(p->p.startsWith("K")).forEach(c->System.out.println(c));
		//------forEach example for list of strings
		//for(String s:list) {
		//	System.out.println(s);
		//}
		
		//list.stream().forEach(s->System.out.println(s));
		//------forEach example for map of values
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		//map.forEach((key,value) -> System.out.println(key+ ":"+value));
		//map.entrySet().stream().forEach(obj -> System.out.println(obj));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(c->System.out.println(c));
	}

}
