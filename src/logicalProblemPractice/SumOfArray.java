package logicalProblemPractice;

public class SumOfArray {
	
	public static void main(String[] args) {
		int arr[] = new int[] {1,3,6,7};
		
		int i;
		int sum=0;
		for(i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
        System.out.println("Sum of all the elements of an array: " + sum);  
	}

}
