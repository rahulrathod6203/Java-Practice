package com.cg.InterviewPreparation;

import java.util.HashMap;

public class OccurancesOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "rahulrathod";
		
		
//		List<String> collect = Arrays.stream(str.split("")).collect(Collectors.toList());
//		
//		System.err.println(collect);
		
		HashMap<Character, Integer> res = new HashMap<>();

		char[] charArray = str.toCharArray();

		for (Character c : charArray) {

			if (res.containsKey(c)) {

				res.put(c, res.get(c) + 1);
			} else {
				res.put(c, 1);
			}

		}

		System.out.println(res);

	}
}
