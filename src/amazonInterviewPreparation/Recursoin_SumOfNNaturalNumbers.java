package amazonInterviewPreparation;

public class Recursoin_SumOfNNaturalNumbers {
	
	public static int sumOfNaturalNumbers(int n) {
		
		if(n == 1) {
			return n;
		}
		
		return n + sumOfNaturalNumbers(n-1);
	}
	
public static int sumOfNaturalNumbersIteraration(int n) {
		
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += i;
			
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("By Recursion answer is "+sumOfNaturalNumbers(30));
		System.out.println("By Iteration answer is "+sumOfNaturalNumbersIteraration(30));
	}

}
