package logicalProblemPractice.convert;

public class Int_To_String {

	public static void main(String[] args) {
		int i = 10;
		String s = Integer.toString(i);
		System.out.println(s);
		//or----------
		String s1 = String.valueOf(i);
		System.out.println(s1);
	}
}
