package logicalProblemPractice;

public class ArraySort_BubbleSort {

public static void main(String[] args) {
	int arr[] = new int[] {22,14,18,44,11,15,12};
	
	int i,j,n=7;
	
	//method use sort-------
	
//	Arrays.sort(arr);
//	for(i=0;i<n;i++) {
//		System.out.print(" "+arr[i]);
//	}
	
	
//	bubble sort-------
	
	for(i=0;i<n-1;i++) {
		for(j=0;j<n-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	
		//OR--------
	
//	for(i=0;i<arr.length;i++) {
//		for(j=i+1;j<arr.length;j++) {
//			if(arr[i]>arr[j]) {
//				int temp = arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
		
		
	}
	
	System.out.println("After sorting ");

	
	for(i=0;i<n;i++) {
		System.out.print(" "+arr[i]);
		}
	
}
	
		
	
}
