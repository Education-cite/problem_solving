package ExtraPractice;

public class SumOfDisit {
	
public static void main(String[] args) {
	
	int sum = 0;
	int num = 124;
	int temp=num;
	 while(temp!=0) {
		int r=temp%10;
		sum=sum+r;
		temp=temp/10;
	 }
	
	System.out.println(num + "  sum of disit: "+sum);
	
}
}
