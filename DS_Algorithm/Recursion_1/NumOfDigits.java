package Recursion_1;

public class NumOfDigits {
	//private static int count;
	
	public static int count(int n){
		
		if (n==0) {
			return 0;
		}
		int smallAns = count(n/10);
		 //count = count+1;
		return smallAns+1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(1561548965));
	}

}
