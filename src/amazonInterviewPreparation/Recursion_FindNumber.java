package amazonInterviewPreparation;

public class Recursion_FindNumber {
	
	public static boolean isNumberPresent(int[] arr, int num) {
		if(arr.length == 1) {
			return arr[0]==num;
		}
		
		
		
		int[] smallArr = new int[arr.length-1];
		for(int i =1; i < arr.length; i ++) {
			smallArr[i-1] = arr[i];
		}
		if(arr[0] == num) {
			return true;
		}else {
		boolean isPresent = isNumberPresent(smallArr, num);
		return isPresent;
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {1,0,1,3,6,9};
		System.out.println(isNumberPresent(arr,7));
	}

}
