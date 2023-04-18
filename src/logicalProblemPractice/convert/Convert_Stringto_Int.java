package logicalProblemPractice.convert;

public class Convert_Stringto_Int {
public static void main(String[] args) {
	String s = "200";
	int i = Integer.valueOf(s);
	System.out.println(i);
	
	//or---------
	int i2 = Integer.parseInt(s);
	System.out.println(i2);
	
	//or-------
	int i3 = new Integer(s).intValue();
	System.out.println(i3);

	
}
}
