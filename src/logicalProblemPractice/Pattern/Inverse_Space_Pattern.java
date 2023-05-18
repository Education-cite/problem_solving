package logicalProblemPractice.Pattern;

public class Inverse_Space_Pattern {
	
public static void main(String[] args) {
		
		int n=3;
		
		for(int row=n;row>=1;row--) {
			for(int col=1;col<=n-row;col++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col);

			}
			System.out.println();
		}
		
	}
}
