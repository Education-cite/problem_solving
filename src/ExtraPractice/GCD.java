package ExtraPractice;

public class GCD {
public static void main(String[] args) {
	int num1=60;
	int num2=24;
	while(num2!=0) {
		int r =num1%num2;
		num1=num2;
		num2=r;
	}
	System.out.println(" GCD is : "+num1);
}
}
