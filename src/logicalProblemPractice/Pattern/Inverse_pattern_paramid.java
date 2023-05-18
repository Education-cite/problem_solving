package logicalProblemPractice.Pattern;

public class Inverse_pattern_paramid {
	

public static void main(String[] args) {
	
	
	int n=5;
	for(int row=n; row>=1;row--) {
		
		for(int col=1;col<=n-row;col++) {
			
			System.out.print(" ");
			
		}
		
		for(int col=1;col<=2*row-1;col++) {
			
			System.out.print("*");
			
		}
		
		
		System.out.println();
	}
}


}
