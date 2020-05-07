package amazonInterviewPreparation;

public class CheckNumberSequence {

	public static boolean checkSequence(int[] arr) {
		int  i =0,k=0;
		int totalAscendingCheck=0, totalDescendingCheck=0;
		while(i  < arr.length-1) {
			if(k  != 1) { 
				
					if(arr[i] > arr[i+1]) {
						if(totalAscendingCheck==arr.length-2) {
							return true;
						}
						totalAscendingCheck++;
						i++;
						continue;
					}else {
						k=1;

					}
				
			}
			else {
				if(arr[i]<arr[i+1]) {
					if(totalDescendingCheck==arr.length-2) {
						return true;
					}
					if(i== arr.length-2) {
						return true;
					}
				}
				else {
					return false;
				}
			}


			i++;
		}
		return false;

	}




	public static void main(String[] args) {
		int[] arr = {0,1,2};
		System.out.println(checkSequence(arr));

	}

}
