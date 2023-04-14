package ExtraPractice;

import java.util.Random;

public class RandomNomber {
	public static void main(String[] args) {
//		Random r = new Random();
//		int rand = r.nextInt(10)+1;
		
		int rand = (int)( Math.random()*10)+1;
		
		System.out.println("Random number is "+rand);
	}
}
