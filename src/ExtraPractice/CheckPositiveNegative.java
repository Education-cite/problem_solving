package ExtraPractice;

import java.util.Scanner;

public class CheckPositiveNegative {

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.println("Please enter int number");
	int num = s.nextInt();
	
	if(num>0) {
		System.out.println(num +" is positive Number");
	}else if(num<0) {
		System.out.println(num +" is Negative Number");

	}else {
		System.out.println(num +" is Zero Number");
	}
}	
}
