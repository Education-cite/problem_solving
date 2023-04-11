package logicalProblemPractice;

public class PrimeNumber {
	
	public static void main(String[] args) {
		primeFirst: for (int i = 2; i <= 10; i++) {

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue primeFirst;
				}
			}
			System.out.println(i + " is prime number");
		}
	}

}
