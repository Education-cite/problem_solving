package logicalProblemPractice.convert;

public class Convert_FloatToString {
public static void main(String[] args) {
	float f=12.3F;
	String s = String.valueOf(f);
	System.out.println(s);
	
	//or------------
	
	
	String s1 =Float.toString(f);
	System.out.println(s1);

	
}
}
