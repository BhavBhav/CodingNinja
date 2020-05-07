package amazonInterviewPreparation;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,8,6,4,2,2};
		System.out.println("===Finding Duplicates from the List By Iteration ====");
		System.out.println(findDuplicate(arr));
	}

	private static int  findDuplicate(int[] arr) {
		int temp=0, k=0;
		for (int i = 0; i < arr.length; i++) {
			if(k== 1) {
				break;
			}
			for (int j = 0; j < arr.length; j++) {
				if(i != j) {
					if(arr[i] == arr[j]) {
						temp = arr[i];
						k = 1;
						break;
					}
					else {
						continue;
					}
				}
			}

		}

		return temp;
	}

}
