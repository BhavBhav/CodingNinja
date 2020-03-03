package Sort;

public class CheckPalindrome {
	
	public static boolean checkPalindrome(String str) {
		int k=0;
		String str1= null;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				k++;
				
			}
		}
		if(k==str.length()) {
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome("NavyayvaN"));

	}

}
