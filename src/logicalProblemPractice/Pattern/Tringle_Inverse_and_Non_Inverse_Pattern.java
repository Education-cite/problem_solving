package logicalProblemPractice.Pattern;

public class Tringle_Inverse_and_Non_Inverse_Pattern {
	
	public static void main(String[] args) {
		
		int n=5;
		for(int row=1; row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				
				//System.out.print(" "+col); //differnt number pattern
			
				//	System.out.print(" "+row); //same number pattern
				//	System.out.print(" "+col%2); //binary number pattern
				//	System.out.print(" "+row%2); //same binary number pattern
					System.out.print((char)(col+64)+" "); //differnt Alphabatic pattern
				//	System.out.print((char)(row+64)+" "); //same Alphabatic pattern


				
			}
			System.out.println();
		}
		
		
		
		for(int row=n-1; row>=1;row--) {
			
			for(int col=1;col<=row;col++) {
				
				//System.out.print(" "+col); //differnt number pattern
			
				//	System.out.print(" "+row); //same number pattern
				//	System.out.print(" "+col%2); //binary number pattern
				//	System.out.print(" "+row%2); //same binary number pattern
					System.out.print((char)(col+64)+" "); //differnt Alphabatic pattern
				//	System.out.print((char)(row+64)+" "); //same Alphabatic pattern


				
			}
			System.out.println();
		}
		
		
		
		
	}

}
