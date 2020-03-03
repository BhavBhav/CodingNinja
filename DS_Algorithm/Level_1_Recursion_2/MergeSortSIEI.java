package Level_1_Recursion_2;

public class MergeSortSIEI {
	
	public static void mergeSort(int[] input, int si, int ei){
		if(si>=ei) {
			return;
		}
		int mi = (si+ei)/2;
		mergeSort(input,si,mi);
		mergeSort(input, mi+1, ei);
		merge(input, si, ei);
	}
	public static void merge(int[] input, int si, int ei) {
		
		int mi = (si+ei)/2;
		int i=si,j=mi+1,k=0;
		int[] ans = new int[ei-si+1];
		while(i<=mi && j<=ei) {
			if(input[i]<input[j]) {
				ans[k]=input[i];
				i++;
				k++;
			}
			else {
				ans[k]=input[j];
				j++;
				k++;
			}
			}
		
		while(i<=mi) {
			ans[k]=input[i];
			k++;
			i++;
		}
		while(j<=ei) {
			ans[k]=input[j];
			k++;
			j++;
		}
		for(int t=0; t<ans.length; t++) {
			input[si+t]= ans[t];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,25,14,1,20,10,15,6,98,78};
		mergeSort(arr, 0, arr.length-1);
		for(int t=0; t<arr.length; t++) {
			System.out.print(arr[t]+" ");
		}
	}

}
