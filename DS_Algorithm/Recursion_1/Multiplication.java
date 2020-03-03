package Recursion_1;

public class Multiplication {
	public static int multiplyTwoIntegers(int m, int n){
		if(m==1|| m<0) {
			return n;
		}
		if(m==0) {
			return 0;
		}
		int smallAns = n+ multiplyTwoIntegers(m-1, n);
		return smallAns;
		
	}

	public static void main(String[] args) {
		System.out.println(multiplyTwoIntegers(0, 25));
		

	}

}
