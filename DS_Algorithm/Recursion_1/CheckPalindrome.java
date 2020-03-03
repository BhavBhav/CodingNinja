package Recursion_1;

public class CheckPalindrome {
	public static int i;
	
	public static boolean isSmallPalindrome(String input, int start, int end) {
		if(end<=1) {
			
			return true;
		}
		
		if (input.charAt(start)!= input.charAt(end)) {
			return false;
		}
		else {
			boolean smallChek= isSmallPalindrome(input, start+1, end-1);
			return smallChek;
		}
		
		
	}
	public static boolean isStringPalindrome(String input) {
		int start = 0;int end = input.length()-1;
		if (end <=1) {
			return true;
		}
		if(input.charAt(0)!=input.charAt(input.length()-1)) {
			return false;
		}
		else {
			boolean check = isSmallPalindrome(input,start+1,end-1);
			//boolean mainCheck = isStringPalindrome(input);
			return check;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isStringPalindrome("rac4e4ca4r"));

	}

}
