package com.cg.coding;

public class PrimeNumbers {

	public static String isPrime(int number) {

		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}
		}

		if(prime) {
			return number + " is a Prime number";
		}else {
			return number + " is not a Prime number";
		}

	}

	public static void main(String[] args) {

		System.out.println(PrimeNumbers.isPrime(12));
	}

}
