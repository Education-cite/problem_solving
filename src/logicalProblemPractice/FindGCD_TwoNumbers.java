package logicalProblemPractice;

public class FindGCD_TwoNumbers {
	
	public static void main(String[] args) {
//		 int a = 50;
//		 int b = 60;
//		 
//		 while(a!=b) {
//			 
//			 if(a>b) {
//				 a=a-b;
//			 }else {
//				 b=b-a;
//			 }
//		 }
//		 System.out.printf("GCD of a and b is: " +b);
		
		
		int a = 60;
		int b = 50;
		int r;
		
		while(b!=0) {
			
			r = a%b;
			a=b;
			b=r;
		}
		
	 System.out.printf("GCD of a and b is: " +a);


	}

}
