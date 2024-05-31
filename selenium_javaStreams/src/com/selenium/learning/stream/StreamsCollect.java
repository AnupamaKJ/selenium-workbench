package com.selenium.learning.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCollect {

	public static void main(String[] args) {
		
		//list
		//new list
		//new list
		
		List<String> ls = Stream.of("Abijeet", "don", "Alekhya", "Adam", "Rama" ).filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(ls.get(0));

	}

}
