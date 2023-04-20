package ExtraPractice;

public class WhileLoop {

	public static void main(String[] args) {
		int i;
		int x=2;
		
		for(i=0;i<=10;i++){
			if(i%2==0) {
				continue;
			}
			//System.out.println(i);
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}
}
