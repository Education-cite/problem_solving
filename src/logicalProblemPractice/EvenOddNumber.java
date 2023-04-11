package logicalProblemPractice;

public class EvenOddNumber {

	public static void main(String[] args) {
		int num = 30;
		
		System.out.print("List of even numbers from 1 to "+num+": ");  


		for (int i = 1; i <= 30; i++) {

			if (i % 2 == 0) {

				// System.out.println(i + "is Even Number ");

				continue;

			} else {
				System.out.print(i + " ");

			}

		}
	}
}
