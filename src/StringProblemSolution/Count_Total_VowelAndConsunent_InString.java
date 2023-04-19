package StringProblemSolution;

public class Count_Total_VowelAndConsunent_InString {

	public static void main(String[] args) {
		
		int cVowel=0,word=0,cConsunent=0,digit=0,other=0;
		
        String str = "This is a really simple sentence 420";    
        str=str.toLowerCase();
		
		for(int i=0; i<str.length();i++) {
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				cVowel++;
			}else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
				cConsunent++;
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				digit++;
			}
			
			
			else if(str.charAt(i)==' ') {
				word++;
			}else {
				other++;
			}
		}
			word++;
		
		 System.out.println("Number of vowels: " + cVowel);    
	     System.out.println("Number of consonants: " + cConsunent); 
	     System.out.println("Number of digits: " + digit);   
	     System.out.println("Number of words: " + word);   
	     System.out.println("Number of others: " + other);   

		
		
	}
}
