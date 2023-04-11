package logicalProblemPractice;

public class ReverseNumber {
	
public static void main(String[] args) {
	
	int num = 2345;
	int temp = num;
	int sum = 0;
	int r;
	
	while(temp!=0) {
		r=temp%10;
		sum = sum*10 +r;
		temp=temp/10;
	}
	System.out.println("Reverse number of " + num + " = " + sum);
	
}
}
