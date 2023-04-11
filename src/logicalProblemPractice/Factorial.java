package logicalProblemPractice;

import java.util.Scanner;

public class Factorial {

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("please enter your number");
	
//	int num = s.nextInt();
	int num = 5;
	int fact=1;
	
	for(int i=num; i>=1; i--) {
		
		fact=fact*i;
		
	}
	
	System.out.println("Factorial of is " + num + " = " +fact);
	
	
}

}
