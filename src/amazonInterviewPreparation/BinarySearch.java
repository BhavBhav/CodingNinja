package amazonInterviewPreparation;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,100,150,200,210,300};
		binarySearch(arr, 5);

	}

	private static void binarySearch(int[] arr, int num) {

		int lastIndex = arr.length-1;
		int startIndex = 0;
		int meanIndex = (lastIndex + startIndex) / 2;
		while(startIndex <= lastIndex) {
			if(arr[meanIndex] < num) {
				startIndex = meanIndex+1;
				meanIndex = (lastIndex + startIndex) / 2;
			}
			else {
				lastIndex = meanIndex-1;
				meanIndex = (lastIndex + startIndex) / 2;
			}
			if(num == arr[meanIndex]) {
				System.out.println("Found the number");
				break;
			}
		}
		System.out.println("Not found");
	}

}
