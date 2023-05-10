package logicalProblemPractice.Array;

public class Even_Odd_Position_Array {
	public static void main(String[] args) {
		
		int [] arr = new int [] {1,2,3,4,8,6};
		System.out.print("Array Even position : ");
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+", ");
		}
		System.out.println(" ");
		System.out.print("Array odd position : ");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+", ");
		}
	}

}
