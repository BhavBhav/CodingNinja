package Recursion_1;

public class SumArray {
	
	public static int sum(int input[]) {
		
		if(input.length==1) {
			return input[0];
		}
		
		int[] smallArr = new int[input.length-1];
		for (int i=1; i<input.length;i++) {
			smallArr[i-1]= input[i];
		}
		int num = 0;
		num=input[0]+sum(smallArr);
		return num;
		
		
	}

	public static void main(String[] args) {
		int input[]= {1,3,6,7,20};
		System.out.println(sum(input));

	}

}
