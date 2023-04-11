package forloopProblem;

public class Problem3 {
	public static void main(String[] args) {

		//print the summation of squares of all numbers from 5 to 25
		
		//25 + 36 + 49 + -------+625 = ?
		
		int i,sum = 0;
	//	int sum=0;
		for(i=5;i<=25;i++) {
			sum=sum+(i*i);
		}
		System.out.println("the summation of squares of all numbers from 5 to 25 is = "+sum);
		
	}
}
