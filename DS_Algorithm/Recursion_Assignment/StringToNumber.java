package Recursion_Assignment;

public class StringToNumber {
	public static int i=1;
	
	public static int convertStringToInt(String input){
		return convertStringToInt(input, 0);
		
	}
	public static int convertStringToInt(String input,int startIndex){
		
		if(input.length()<=1) {
			return Integer.parseInt(input);
		}
		String temp2= input.substring(0,1);
		String temp1= input.substring(1);
		int temp = convertStringToInt(temp1,startIndex+1);
		i=i*10;
		return Integer.parseInt(temp2)*i +temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertStringToInt("125834"));
	}

}
