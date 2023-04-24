package logicalProblemPractice.convert;

public class Convert_StringToFloat {
	public static void main(String[] args) {
		String s = "1234";
		Float f = Float.parseFloat(s);
		System.out.println(f);
		
		//or--------------
		
		Float f1 = Float.valueOf(s);
		System.out.println(f1);


		
	}

}
