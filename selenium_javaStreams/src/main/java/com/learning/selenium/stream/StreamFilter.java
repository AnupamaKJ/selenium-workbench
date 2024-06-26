package com.learning.selenium.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Ajeeth");
		names.add("dom");
		names.add("Alekhya");
		names.add("Ram");
		
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		
		Long e = Stream.of("Adam", "Ajeeth", "dom", "Alekhya", "Ram" ).filter(a->
		{
			a.startsWith("d");
			return false;
		}).count();
		
		System.out.println(e);
		
		
		// print all the names in the list
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()<4).limit(1).forEach(s->System.out.println(s));
		
		
	}
}
