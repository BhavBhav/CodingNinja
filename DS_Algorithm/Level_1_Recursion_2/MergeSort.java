package Level_1_Recursion_2;

public class MergeSort {
	
	public static void mergeSort(int[] input){
		
		int[] p1 =new int[(input.length)/2];
		int[] p2 =new int[(input.length)-(input.length/2)];
		for(int i=0; i<(input.length)/2;i++) {
			p1[i]=input[i];
			System.out.print(p1[i]+" ");
			
			p2[i]=input[(input.length/2)+i];
			System.out.print(p2[i]+" ");
			
			System.out.println();
		}
		if(input.length/2!=0) {
			p2[(input.length)-(input.length/2)-1]=input[input.length-1];
			System.out.println(" "+p2[(input.length)-(input.length/2)-1]);
		}
		sorting(p1);
		for(int i=0;i<p1.length;i++) {
			System.out.print(p1[i]+" ");
		}
		sorting(p2);
		for(int i=0;i<p2.length;i++) {
			System.out.print(p2[i]+" ");
		}
		
		
	}
	public static int[] sorting(int[] arr) {
		if(arr.length<=1) {
			return arr;
		}
		int[] smallArr = new int[arr.length-1];
		for(int i=1; i<arr.length;i++) {
			smallArr[i-1]=arr[i];
		}
		int[] sort = sorting(smallArr);
		int[] temp = new int[smallArr.length];
		if(arr[0] > smallArr[0]) {
			int tempVar =smallArr[0];
			smallArr[0]= arr[0];
			arr[0]=tempVar;
			
			
		}
		for(int i=0; i<temp.length;i++) {
			temp[i]=smallArr[i];
		}
		for(int i=0; i<temp.length;i++) {
			smallArr[i]=temp[i];
		}
		return smallArr;
		
		
		
	}
	
	public static void main(String[] args) {
		int[] input = {12,5,6,84,51,13};
		mergeSort(input);
		
	}

}
