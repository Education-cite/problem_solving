package ExtraPractice;

public class Array_Sort {
public static void main(String[] args) {
	//creating an instance of an array  
	int[] arr = new int[] {3,6,55,77,66,44,33,22,51};  
	System.out.println("Array elements after sorting:");  
	//sorting logic  
	for (int i = 0; i < arr.length; i++)   
	{  
	for (int j = i + 1; j < arr.length; j++)   
	{  
	int tmp = 0;  
	//if (arr[i] < arr[j])  //desending order-----------
	if (arr[i] > arr[j]) //asending order---------
	{  
	tmp = arr[i];  
	arr[i] = arr[j];  
	arr[j] = tmp;  
	}  
	}  
	//prints the sorted element of the array  
	System.out.print(arr[i]+" ");  
	}  
	}  

}