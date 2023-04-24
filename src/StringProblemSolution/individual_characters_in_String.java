package StringProblemSolution;

public class individual_characters_in_String {
	public static void main(String[] args) {
		String str = "Bangladesh";
        System.out.println("Individual characters from given string: ");  

		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
	}

}
