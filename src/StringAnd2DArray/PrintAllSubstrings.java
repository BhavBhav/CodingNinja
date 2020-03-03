package StringAnd2DArray;

import java.util.Arrays;

public class PrintAllSubstrings {
	
	public static void printSubstrings(String str){
        for (int i=0; i<str.length();i++)
        {
        	for (int j=i; j<str.length();j++){
        	/*System.out.println(str.charAt(i));
            System.out.println(str.substring(i));*/
            System.out.println(str.substring(i, j+1));
        }
        //System.out.println(str.substring(1, 2));
        
	}
	}
	public static void reverseWordWise(String input) {
		
		
		String[] str= input.split(" ");
		String[] str1= new String[str.length];
		for(int i=str.length-1;i>=0;i--) {
			str1[str.length-i-1] = str[i];
			System.out.print(str[i]+" ");
		}
		String str2 = Arrays.toString(str1);
		System.out.print(str2);
	}
	
	
	
	public static void main(String[] args) {
		//printSubstrings("xyz");
		reverseWordWise("Welcome to coding ninja");
	}

}
