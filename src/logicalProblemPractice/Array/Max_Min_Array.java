package logicalProblemPractice.Array;

public class Max_Min_Array {
public static void main(String[] args) {
	int a[]= {6,8,9,33,67};
	
	int max = a[0];
	int min = a[0];
	
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) 
		{
			max=a[i];
		}
	}
    System.out.println("Largest element present in given array: " + max); 
    
    
    for(int i=0;i<a.length;i++) {
		if(a[i]<min) 
		{
			min=a[i];
		}
	}
    System.out.println("Smallest element present in given array: " + min); 
    
    
    
    //or--------------
    
//    int[] arr = new int[] {6,8,9,33,67};;
//	int max1=arr[0];
//	int min1=arr[0];
//	
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]>max1) {
//			max1=arr[i];
//			
//		}else if(arr[i]<min1){
//			min1=arr[i];
//
//		}
//	}
//	System.out.println(max1+" max number");
//	System.out.println(min1+" min number");
    
    
    
    
    
}
}
