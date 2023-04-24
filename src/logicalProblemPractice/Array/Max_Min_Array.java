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
}
}
