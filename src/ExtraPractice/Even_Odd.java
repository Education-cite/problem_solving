package ExtraPractice;

import java.util.Scanner;

public class Even_Odd {
	
	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter integer number");
		int num=s.nextInt();
		
			if(num%2==0) {
				System.out.println(num + " is Even number");
			}else {
				System.out.println(num + " is Odd number");

			}
		}
	}


