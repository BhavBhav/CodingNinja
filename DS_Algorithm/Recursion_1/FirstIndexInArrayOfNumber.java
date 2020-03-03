package Recursion_1;

public class FirstIndexInArrayOfNumber {
	public static int k=0;
	public static int firstIndex(int input[], int x) {
		int smallNum = firstIndex(input, x,input.length-1);
		return smallNum;
		
	}
	
	public  static int firstIndex(int input[], int x, int startIndex) {
		
		if(input[input.length-1]<= 1) {
			if(x==input[0]) {
				return input.length-1;
			}
			return -1;
		}
		/*int[] smallArr = new int[input.length-1];
		for (int i=1; i<input.length;i++) {
			smallArr[i-1]= input[i];
		}*/
		//int startIndex=0;
		if(x==input[startIndex]) {
			
			return startIndex;
			
		}
		else {
			if(startIndex==0) {
				return -1;
			}
			int smallNum = firstIndex(input, x, startIndex-1);
			
			return smallNum;
		}
			
	}
	

	

	public static void main(String[] args) {
		int[] arr = {7,8,1,9,8,10};
		System.out.println(firstIndex(arr, 80));

	}

}
