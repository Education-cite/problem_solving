package logicalProblemPractice.convert;

public class String_To_Long {
public static void main(String[] args) {
	String s = "100";
	Long l = Long.valueOf(s);
	System.out.println(l);
	
	//or----------
	
	Long l1 = Long.parseLong(s);
	System.out.println(l1);
}
}
