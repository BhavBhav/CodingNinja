package amazonInterviewPreparation;

public class Recursion_SumOfArray {
	
	public static int recursionSum(int[] arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		
		int[] smallArr = new int[arr.length-1];
		for (int i = 0; i < smallArr.length; i++) {
			smallArr[i] = arr[i+1];
		}
		
		int ans = arr[0] + recursionSum(smallArr);
		
		return ans;
	}

	public static void main(String[] args) {
		
		
		int[] arr = {1,0,1,3,6,9};
		System.out.println(recursionSum(arr));

	}

}
