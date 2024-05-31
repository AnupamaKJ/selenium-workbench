package com.selenium.learning.stream;

import java.util.stream.Stream;

public class String_Map {

	public static void main(String[] args) {
		
		Stream.of("Adam", "Ajeeth", "dom", "Alekhya", "Rama" );
		
		Stream.of("Adam", "Ajeeth", "dom", "Alekhya", "Rama" ).filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
		System.out.println("---------------------------------------");
		
		Stream.of("Adam", "Ajeeth", "dom", "Alekhya", "Rama" ).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("---------------------------------------");
		
		// print names which have first letter as A with Upper case and sorted
		
		Stream.of("Azdam", "Ajeeth", "dom", "Alekhya", "Rama").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
