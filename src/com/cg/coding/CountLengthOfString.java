package com.cg.coding;

public class CountLengthOfString {

	public static void main(String[] args) {

		String str = "Rahul";
		int characterCount = 0, spaceCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				characterCount += 1;
			}

			if (str.charAt(i) == ' ') {
				spaceCount += 1;
			}

		}
		System.out.println("No. of Characters :" + characterCount + " \n" + "No. of Spaces :" + spaceCount);
	}

}
