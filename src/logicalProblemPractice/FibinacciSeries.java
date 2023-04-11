package logicalProblemPractice;

import java.util.Scanner;

public class FibinacciSeries {
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("please enter your number");
	
	int num = s.nextInt();
	
	int first=0;
	int second = 1;
	System.out.print(first+" "+second);
	int fibo;
	
	
	for(int i=3;i<=num;i++) {
		
		fibo=first+second;
		System.out.print(" " +fibo);
		first=second;
		second=fibo;
	}
	
	
	
	
	
	
}	

}
