package Recursion_Assignment;

import java.awt.peer.SystemTrayPeer;

public class RemoveX {
	
	public static String removeX(String input){
		return removeX(input, 0);
	}
	
	public static String removeX(String input, int startIndex){
		if(input.length()<=1) {
			if(input.charAt(0)=='x'){
				return "";
			}
			else {
				return input;
			}
		}
		String temp1= input.substring(1);
		String temp = removeX(temp1,startIndex+1);
		if(input.charAt(0)=='x' ) {
			return ""+temp.substring(0);
		}
		else {
			return input.charAt(0)+temp.substring(0);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(removeX("xxxxaxxxxbxx"));
	}

}
