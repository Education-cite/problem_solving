package logicalProblemPractice;

public class FindDuplicaate_Array {

	public static void main(String[] args) {
		int [] arr = new int[] {1,4,5,4,6,7,5};
        System.out.println("Duplicate elements in given array: ");  

		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
                    System.out.print("  "+arr[j]);  

				}
			}
		}
		
	}

}
