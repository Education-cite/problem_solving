package logicalProblemPractice;

public class SumOfNaturlNumber {
	
	// sum to number 1 to 10

	public static void main(String[] args) {

		int num = 10;
		int sum = 0;
		int i;

		for (i = 1; i <= num; i++) {

			sum = sum + i;

		}

		System.out.println("Sum of First 10 Natural Numbers is = " + sum);
	}

}
