package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many numbers would you like sorted?");
		int number = in.nextInt();
		
		
		boolean[] isPrime = new boolean[number+1];

		for (int i = 2; i <= number; i++) {
			isPrime[i] = true;
	}
		for (int p = 2; p*p <= number; p++) {
			if (isPrime [p]) {
				for (int i = p * p; i <= number; i += p)
					
					isPrime[i] = false; 
			}
	}
		for (int i = 2; i<= number; i++) {
			
			if (isPrime[i]) {
				
				System.out.println(i);
			}
		}
	}
	
}
