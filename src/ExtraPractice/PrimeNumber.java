package ExtraPractice;

public class PrimeNumber {
public static void main(String[] args) {

	int i;
	int count=0;
	int num=11;
	for(i=2;i<num;i++) {
		if(num%i==0) {
			count++;
			break;
		}
	}
	if(count==0) {
		System.out.println(num + " is prime number");
	}else {
		System.out.println(num + " is not prime number");

	}
}
}
