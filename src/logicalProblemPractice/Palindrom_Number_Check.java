package logicalProblemPractice;

import java.util.Scanner;

public class Palindrom_Number_Check {

	public static void main(String[] args) {
		
		int num = 122;
		int temp = num;
		int sum = 0;
		int r;
		
		while(temp!=0) {
			 r=temp%10;
			 sum = sum*10 + r;
			 temp = temp/10;
		}
		if(num==sum) {
			System.out.println(num + "  is palindrom Number");
		}else {
			System.out.println(num + "  is not palindrom Number");

		}
		
		
		//OR----------------
		
		
//		 String original, reverse = ""; // Objects of String class  
//	      Scanner in = new Scanner(System.in);   
//	      System.out.println("Enter a string/number to check if it is a palindrome");  
//	      original = in.nextLine();   
//	    
//	      for ( int i = original.length() - 1; i >= 0; i-- )  
//	         reverse = reverse + original.charAt(i);  
//	      if (original.equals(reverse))  
//	         System.out.println("this is a palindrome.");  
//	      else  
//	         System.out.println("this isn't a palindrome."); 
		
		
	}
}
