package Recursion_Assignment;

public class PairStar {
	
	public static String addStars(String s) {
		return addStars(s, 0);
	}
	public static String addStars(String s, int startIndex) {
		if(s.length()<=1) {
			return s;
		}
		String temp1 = s.substring(startIndex+1);
		String temp = addStars(temp1, startIndex);
		
		if(s.charAt(0)== temp.charAt(0)) {
			return s.charAt(0)+"*"+temp.substring(0);
		}
		else {
			return s.charAt(0)+temp.substring(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(addStars("aaaa"));
	}

}
