package logicalProblemPractice;

import java.util.Scanner;

public class PrimeNumbercheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter int number");
		int num = sc.nextInt();
		int count=0;
		if(num==0 || num ==1) {
			System.out.println(num + " is not prime number");

		}else {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(num + " is prime number");
		}else {
			System.out.println(num + " is not prime number");

		}
		
		}
		
	}

}
