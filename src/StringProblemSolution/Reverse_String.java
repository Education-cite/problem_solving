package StringProblemSolution;

public class Reverse_String {
public static void main(String[] args) {
	String str = "Hellow Enamul";
	String reverse = "";
	
	for(int i = str.length()-1;i>=0;i--) {
		reverse = reverse + str.charAt(i);
	}
	System.out.println(str + "  Reverse String is : " +reverse); 
}
}
