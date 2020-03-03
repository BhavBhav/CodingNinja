package Level_1_Recursion_2;

public class ReplaceCharRecursively {
	
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length()<=1) {
			if(input.charAt(0)==c1) {
				
				return Character.toString(c2) ;
			}
			else return input;
		}
		String str = "";
		if(input.charAt(0)==c1) {
			str = str+ Character.toString(c2) ;
		}
		else str = str+Character.toString(input.charAt(0)) ;
		String strSmall = replaceCharacter(input.substring(1), c1, c2);
		return str+strSmall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceCharacter("abbxc11a", 'a', 'x'));

	}

}
