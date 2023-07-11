package com.cg.coding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SplittingAndJoiningStringInJava8 {

	public static void main(String[] args) {

		String str = "hello";

		//String[] str2 = str.split("");

		String collect = Arrays.stream(str.split("")).map(i -> i.toUpperCase()).collect(Collectors.joining());
		
		
		// Sorting a string in Java 8
		String sorted = Arrays.stream(str.split("")).sorted().collect(Collectors.joining());
		
		

		System.out.println(sorted);
	}

}
