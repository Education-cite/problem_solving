package forloopProblem;

public class ForLoop {

	public static void main(String[] args) {
		
		//problem 1--------print 1 to 100 which value 100,90,80,70,60,50,40,30,20,10,0--------
		
		int i;
		for(i=100;i>=0;i=i-10) {
			System.out.println(i);
		}
		
		
		// problem 2---------write a for Loop which will print summation of all the numbers 
	//	which are divided by 3 an 5 between 30 to 120
		
		
		int j,sum=0;
		
		for(j=30;j<=120;j++) {
			if(j%3==0 && j%5==0) {
				sum=sum+j;
			}
		}
		System.out.println("Result of Summation : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
