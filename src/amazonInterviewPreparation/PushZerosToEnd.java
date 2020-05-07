package amazonInterviewPreparation;

public class PushZerosToEnd {
	
	public static void pushZerosToEnd(int[] arr) {
		int end = arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				
				while(end > i) {
					if(arr[end] != 0) {
						int temp = arr[end];
						arr[end] = arr[i];
						arr[i] = temp;
						end--;
						break;
					}
					end--;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	

	public static void main(String[] args) {
		int[] arr = {1,2,0,4,0,6,0,8};
		pushZerosToEnd(arr);
	}

}
