package amazonInterviewPreparation;

public class SortZerosOnes {
	
	public static void sortingZerosOnes(int[] arr) {
		
		int i = 0, j = arr.length-1;
		while(i < j) {
			
			if(arr[i] != 0 ) {
				if(arr[j] != 1) {
					arr[i] = 0;
					arr[j] = 1;
					j--;
					i++;
				}
				else {
					j--;
				}
				
			}
			else {
				i++;
			}
			
			
			
		}
		for(int m :arr) {
			System.out.print(m+" ");
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {1,0,1,1,1,1,1,1,0,0,1,0};
		System.out.println("===Sorting Zeroes and Ones ====");
		sortingZerosOnes(arr);

	}

}
