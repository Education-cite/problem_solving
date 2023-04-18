package logicalProblemPractice.convert;

public class LongToStringExample {

	public static void main(String[] args) {
		Long l = 1098765L;
		String s = String.valueOf(l);
		System.out.println(s);
		
		//or--------

		String s2 = Long.toString(l);
		System.out.println(s2);
	}
}
