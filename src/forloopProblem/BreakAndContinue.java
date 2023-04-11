package forloopProblem;

public class BreakAndContinue {
	public static void main(String[] args) {
		
		// continue example----------------
		System.out.println( "continue example");
		
		int i;
		for(i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		

		
		// break example----------------
		System.out.println( "break example");
		
		int j;
		for(j=1;j<=10;j++) {
			if(j%2==0) {
				break;
			}
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
	}
}
