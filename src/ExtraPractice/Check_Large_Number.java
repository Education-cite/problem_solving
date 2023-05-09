package ExtraPractice;

import java.util.Scanner;

public class Check_Large_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		int a = s.nextInt();
		System.out.println("Please enter 2nd number");
		int b = s.nextInt();
		System.out.println("Please enter 3rd number");
		int c = s.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println("first number " +a + " is   largest number");
		}
		else if(b>a && b>c) {
			System.out.println("2nd number " +b + " is  largest number");
		}else {
			System.out.println("3rd number " +c + " is largest number");

		}
		
		if(a<b && a<c) {
			System.out.println("first number " +a + " is   small number");
		}
		else if(b<a && b<c) {
			System.out.println("2nd number " +b + " is  small number");
		}else {
			System.out.println("3rd number " +c + " is small number");

		}
	}
}
