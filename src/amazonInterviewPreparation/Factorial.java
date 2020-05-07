package amazonInterviewPreparation;

public class Factorial {
	
	public static int factorialIteration(int n) {
		int ans = 1;
		for (int i = n; i >= 1; i--) {
			ans = ans * i;
		}
		return ans;
	}
	
	public static int factorialByRecursion(int n) {
		
		if(n == 1) {
			return 1;
		}
		return n * factorialByRecursion(n-1);
		
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println("=====Factorial By Iteration======");
		System.out.println(factorialIteration(n));
		System.out.println("=====Factorial By Recursion======");
		System.out.println(factorialByRecursion(n));

	}

}
