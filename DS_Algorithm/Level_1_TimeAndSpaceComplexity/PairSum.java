package Level_1_TimeAndSpaceComplexity;

public class PairSum {
	
	public static void pairSum(int[] arr, int num){
		mergeSort(arr,0,arr.length-1);
		int i = 0, j=arr.length-1;
		while(i<j) {
			int k=j,m=i;
			if(arr[i]+arr[j]==num) {
				System.out.println(arr[i]+" "+arr[j]);
				
				while(k>i) {
					k--;
					if(arr[i]+arr[k]==num) {
						System.out.println(arr[i]+" "+arr[k]);
						
					}
					else {
						i++;
						break;
					}
				}
				
				
			}
			else {
			if(arr[i]+arr[j]>num) {
				j--;
			}
			if(arr[i]+arr[j]<num) {
				i++;
			}
			//System.out.println();
			}
		}
	}

	private static void joinArray(int[] arr, int si, int ei) {
		int mi=(si+ei)/2;
		int[] alternateArray = new int[ei-si+1];  
		int i=si, k=0, j=mi+1;
		while((i<=mi) && (j<=ei)) {
			if(arr[i]<arr[j]) {
				alternateArray[k]=arr[i];
				i++;
				k++;
			}
			else {
				alternateArray[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mi) {
			alternateArray[k]=arr[i];
			i++;
			k++;
			
		}
		while(j<=ei) {
			alternateArray[k]=arr[j];
			k++;
			j++;
		}
		for (int j2 = 0; j2 < alternateArray.length; j2++) {
			arr[j2+si]=alternateArray[j2];
		}
		
	}

	private static void mergeSort(int[] arr, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int mi = (si+ei)/2;
		if(arr[si]>arr[ei]) {
			int swap = arr[si];
			arr[si]=arr[ei];
			arr[ei]=swap;
		}
		mergeSort(arr,si, mi);
		mergeSort(arr, mi+1, ei);
		joinArray(arr, si, ei);
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4,4,5,6};
		pairSum(arr, 8);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
