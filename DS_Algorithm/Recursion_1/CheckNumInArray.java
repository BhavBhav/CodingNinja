package Recursion_1;

public class CheckNumInArray {
	public static boolean checkNumber(int input[], int x) {
		if(input.length<=1) {
			if(input[0]==x){
			return true;
		}
			return false;
			}
		int[] smallArr = new int[input.length-1];
		for(int i=1;i<input.length;i++) {
			smallArr[i-1]= input[i];
		}
		if(input[0]==x) {
			return true;
		}
		else {
			boolean check = checkNumber(smallArr, x);
			return check;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,3,6,7,30,54,87,5};
		System.out.println(checkNumber(input,15));
	}

}
