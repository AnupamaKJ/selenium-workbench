package com.learning.selenium.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class AddingTwoStreams {

	public static void main(String[] args) {
	
		List<String> names = new ArrayList<String>();
		names.add("women");
		names.add("man");
		
		List<String> names1 =Arrays.asList("Adam", "Ajeeth", "dom", "Alekhya", "Rama" );
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		System.out.println("---------------------------------------");
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

}
