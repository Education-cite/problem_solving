package logicalProblemPractice;

public class ArrayReverseOrder {
	public static void main(String[] args) {
		System.out.println("Original array is ");
		int [] arr = new int[] {1,5,3,9,10};
		for(int i = 0;i<arr.length;i++) {
			System.out.print( " "+arr[i]);
		}
		System.out.println();
		System.out.println("Reverse array is ");

		for(int i=arr.length-1; i>=0; i--) {
			System.out.print( " "+arr[i]);
		}
	}

}
