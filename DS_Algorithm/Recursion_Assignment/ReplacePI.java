package Recursion_Assignment;

public class ReplacePI {
	
	public static String replace(String input){
		return replace(input, 0);
		
	}
public static String replace(String input, int startIndex){
		
		
		if(input.length()<=1) {
			return input;
		}
		String temp1 = input.substring(startIndex+1);
		String temp = replace(temp1, startIndex);
		
		if(input.charAt(0)=='p' && temp.charAt(0)=='i') {
			return "3.14"+temp.substring(1);
		}
		else {
			return input.charAt(0)+temp.substring(0);
		}
	
	}

	public static void main(String[] args) {
		System.out.println(replace("xpixpiyyypi"));

	}

}
