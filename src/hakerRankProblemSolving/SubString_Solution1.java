package hakerRankProblemSolving;

import java.util.Scanner;

/*question:The first line contains a single string string denoting s. the second line
contrains two space seperated integers denoting the rspective values of start and end
*/


public class SubString_Solution1 {
	
	public static void main(String[] args) {
		System.out.println("please input string value");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.println("please input Start value");

		int start = input.nextInt();
		System.out.println("please input end value");

		int end = input.nextInt();
	String result =	s.substring(start, end);
	
	System.out.println("final result of : "+result);
	}


}
