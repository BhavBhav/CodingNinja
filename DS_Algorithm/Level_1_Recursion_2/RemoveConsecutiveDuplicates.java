package Level_1_Recursion_2;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String s) {
		
		if(s.length()<=1) {
				return s;
			}
		String temp = "";
		String strSmall = removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0)==strSmall.charAt(0)) {
			return strSmall;
		}
		else return s.charAt(0)+strSmall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeConsecutiveDuplicates("aaabcccda"));
	}

}
