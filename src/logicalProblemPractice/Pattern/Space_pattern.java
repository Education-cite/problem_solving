package logicalProblemPractice.Pattern;

public class Space_pattern {
	public static void main(String[] args) {
		
		int n=3;
		
		for(int row=1;row<=n;row++) {
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
