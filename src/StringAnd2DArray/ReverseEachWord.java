package StringAnd2DArray;

public class ReverseEachWord {
	
	public static String reverseEachWord(String input) {
		 String[] str= input.split(" ");
		 String output=" ";
			//String[] str1= new String[str.length];
			for(int i=0;i<str.length;i++) {
				for(int j=str[i].length()-1;j>=0;j--) {
					output=output+ str[i].charAt(j);
				}
				output = output+" ";
				
				
			}
			//String joinedString = String.join(" ", str1);
	        return output.trim();
		}
	    
		

		

	public static void main(String[] args) {
		System.out.println(reverseEachWord("Welcome to Coding Ninjas"));

	}

}
