package logicalProblemPractice;

import java.util.Scanner;

public class SumOfDisit {
	

public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Please enter number");
	int num = s.nextInt();
	//int num = 123;
	int temp = num;
	int sum = 0;
	int r;
	
	while(temp!=0) {
		r=temp%10;
		sum = sum +r;
		temp=temp/10;
	}
	System.out.println("Sum number of Disit " + num + " = " + sum);
	
}

}
