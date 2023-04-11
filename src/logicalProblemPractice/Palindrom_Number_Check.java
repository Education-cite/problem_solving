package logicalProblemPractice;

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
	}
}
