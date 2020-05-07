package amazonInterviewPreparation;

public class CheckArmStrongNumber {
	
	public static int numOfDigits(int n) {
		int  k = 0;
		while(n > 0) {
			n = n/10;
			k++;
		}
		return k;
	}
	
	public static int powerOfNumber(int num, int power) {
		int k =num;
		for(int i=1; i < power; i++) {
			num = num*k;
			
		}
		return num;
	}
	
	public static boolean isArmStrongNumber(int n) {
		int checkAns = n;
		int ans = 0;
		int rem =0;
		while(n > 0) {
			rem = n % 10;
			ans = ans + powerOfNumber(rem, numOfDigits(checkAns));
			n =n/10;
			
		}
		if(checkAns == ans) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		int num = 100;
		System.out.println(isArmStrongNumber(num));
		printNumberPattern(3);
		printZerosAndStars(3);
	}

	private static void printZerosAndStars(int n) {
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= 2*n + 1) {
				if(j==i) {
					System.out.print("*");
					
				}
				else if(j == 2*(n + 1) - i) {
					System.out.print("*");
					
				}
				else if(j == n+1) {
					System.out.print("*");
					
				}
				else {
					System.out.print(0);
				}
				j++;
			}
			
			
			System.out.println();
			i++;
		}
		
	}

	private static void printNumberPattern(int n) {
		
		int i =1;
		while(i <= n) {
			int j = 1;
			while(j <= n) {
				if(j == n-i+1) {
					System.out.print("*");
					j++;
				}
				else{
					System.out.print(n-j+1);
				
				j++;
				}
			}
			i++;
			System.out.println();
		}
		
	}

}
