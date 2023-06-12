package com.cg.coding;

public class NumbersAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "rahul123";
		String num = "";
		String str1 = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				str1 += str.charAt(i);

			} else {
				num += str.charAt(i);
			}

		}
		
		System.out.println(str1);
		System.out.println(num);
		
		

	}

}
