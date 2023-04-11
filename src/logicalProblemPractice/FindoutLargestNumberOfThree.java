package logicalProblemPractice;

public class FindoutLargestNumberOfThree {

	public static void main(String[] args) {
		int a = 20; int b = 30; int c = 10;
		
		if(a>b && a>c) {
			System.out.println("the greatest number is : " + a);
		}else if(b>a && b>c) {
			System.out.println("the greatest number is : " + b);
		}else {
			System.out.println("the greatest number is : " + c);
		}
	}
}
