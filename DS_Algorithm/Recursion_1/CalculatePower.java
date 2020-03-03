package Recursion_1;

public class CalculatePower {
	public static int power(int x, int n) {
		if (x==0) {
			return 1;
		}
		int smallAns = n* power((x-1), n);
		return smallAns;
	}
	public static void main(String[] args) {
		
		System.out.println(power(5,2));
	}

}
