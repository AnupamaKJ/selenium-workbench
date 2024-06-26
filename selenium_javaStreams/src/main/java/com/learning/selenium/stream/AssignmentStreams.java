package com.learning.selenium.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AssignmentStreams {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9);
		//print Uniqe number from the array
		//sort Array
		
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		System.out.println("--------------------");
		
		List<Integer> val = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(val.get(3));
		
		
		/*
		 * List<Integer> newList = new ArrayList<Integer>();
		 * 
		 * for(int i =0; i<values.size(); i++) { System.out.println(values.get(i)); int
		 * x; if(!newList.contains(values.get(i))) { x=values.get(i); newList.add(x); }
		 * } System.out.println(newList);
		 */

	}

}
