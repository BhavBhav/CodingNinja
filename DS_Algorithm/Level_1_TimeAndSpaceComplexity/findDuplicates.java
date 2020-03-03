package Level_1_TimeAndSpaceComplexity;

public class findDuplicates {
	
	public static void quickSort(int[] arr, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pivotPos = partition(arr, si, ei);
		//System.out.println(pivotPos);
		quickSort(arr, si, pivotPos-1);
		quickSort(arr, pivotPos+1, ei);
		
	}
	
	private static int partition(int[] arr, int si, int ei) {
		int count=0;
		int k=0;
		for (int i = si+1; i <= ei; i++) {
			
			if(arr[i]<= arr[si]) {
				count++;
			}
		}
		k=count+si;
		int temp = arr[k];
		arr[k]= arr[si];
		arr[si]= temp;
		int i=si,j=ei,p=si;
		while((i<=k)&&(j>k)) {
			if(arr[p]<=arr[k]) {
				p++;
				i++;
			}
			else {
				
				while(arr[j]>arr[k]) {
					j--;
					
				}
				int swap= arr[p];
				arr[p]=arr[j];
				arr[j]=swap;
				j--;
				p++;
				i++;
			}
		}
		
		
		return k;
		
	}

	public static void duplicate(int[] arr){  
		quickSort(arr, 0, arr.length-1);
		int k=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				 k=arr[i];
			}
		}
		System.out.println(k);
		
	}
	

	public static void main(String[] args) {
		int[] arr = {7,4,3,4,8,15,1};
		duplicate(arr);
		//System.out.println(duplicate(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
