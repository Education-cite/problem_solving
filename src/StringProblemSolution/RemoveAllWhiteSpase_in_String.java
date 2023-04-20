package StringProblemSolution;

public class RemoveAllWhiteSpase_in_String {

	public static void main(String[] args) {
		String s = "I Love My Mother";
//		char[] c = s.toCharArray();
//		String str = "";
//		for(int i = 0; i<c.length; i++) {
//			if(c[i]!= ' ') {
//				str=str+c[i];
//			}
//		}
//		System.out.println(str);
		
		//or---------------
		
	String str1 =	s.replaceAll(" ","");
	System.out.println(str1);
	}
}
