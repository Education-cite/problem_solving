package logicalProblemPractice.Array;

public class SumOfArray {
public static void main(String[] args) {
	
	
	int[] arr = new int[] {2,4,6,4,5,1};
	
	int sum = 0;
	
	for(int i = 0; i<arr.length; i++) {
		sum = sum + arr[i];
	}
	
	System.out.println("Sum Of total number of Array : " + sum);
	
}
}
