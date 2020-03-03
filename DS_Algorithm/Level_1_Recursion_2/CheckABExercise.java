package Level_1_Recursion_2;

public class CheckABExercise {
	public static int k=0;
	
	public static boolean checkAB(String input) {
		
		if(input.length()<=2) {
			if(input.charAt(0)=='b' && input.charAt(1)=='b') {
				return true;
			}
			else if(input.charAt(0)=='a' && input.charAt(1)=='a') {
			return true;	
			}
			else {
				return false;
			}
			
		} 
		
		if(k>=0) {
		if(input.charAt(k)!='a') {
			k--;
			return false;
		
		}
		else {
			k--;
		}
		}
		boolean smallAns = checkAB(input.substring(1));
		int m=0;
		if(smallAns==true) {
		if(input.charAt(0)=='a') {
			if(input.charAt(1)=='a'|| (input.charAt(1)=='b'&& input.charAt(2)=='b')) {
				return true;
			}
		}
		if(input.charAt(0)=='b') {
			if(input.charAt(1)=='b'&& input.charAt(2)=='a') {
				return true;
			}
		}
		else {
			return false;
		}
		}
		else {
			m++;
			
		}
		if(m>1) {
			return false;
		} else return smallAns;
		
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkAB("abbbabbaaa"));
	}

}
