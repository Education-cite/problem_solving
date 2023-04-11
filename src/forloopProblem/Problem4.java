package forloopProblem;

public class Problem4 {
	public static void main(String[] args) {
		//show print odd number 10 to 20 but does not print odd>16
		
		int i;
		for(i=10;i<=20;i++) {
			if(i%2==0) 
				continue;
			System.out.println(i);
			 if(i>16) 
				break;
			
			
		}
	}
	
}
