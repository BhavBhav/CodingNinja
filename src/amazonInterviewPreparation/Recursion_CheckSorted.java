package amazonInterviewPreparation;

public class Recursion_CheckSorted {
	
	public static boolean checkSorted(int[] arr) {
		if(arr.length <= 1) {
			return true;
		}
		
		int[] smallArr = new int[arr.length-1];
		for (int i = 0; i < smallArr.length; i++) {
			smallArr[i] = arr[i+1];
		}
		
		boolean isSorted = checkSorted(smallArr);
		if(!isSorted) {
			return false;
		}
		if(arr[0] <= arr[1]) {
			return true;
		}
		else return false;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {2,1,3,6,9};
		System.out.println(checkSorted(arr));

	}

}
