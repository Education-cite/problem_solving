package StringProblemSolution;

public class Count_TotalCharcter_inString {

public static void main(String[] args) {
	

	String str = "I Love My Country";
	int count=0;
	
	for(int i = 0; i<str.length();i++) {
		
        if(str.charAt(i) != ' ')    
        {
			count++;
		}
	}
    System.out.println("Total number of characters in a string: " + count);    
	
	
	
	
	
	
	
	
	
	
}
}
