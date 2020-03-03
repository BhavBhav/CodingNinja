package Recursion_1;

import java.time.chrono.IsoChronology;

public class SortingArraysRecursion {
	public static boolean isSorted(int input[]) {
		if (input.length<=1) {
			return true;
		}
		if(input[0]>input[1]) {
			return false;
		}
		int smallInput[]= new int[input.length-1];
		for(int i=1;i<=smallInput.length;i++) {
			smallInput[i-1]=input[i];
		}
		boolean smallAns = isSorted(smallInput);
		return smallAns;
	}
	
	//checks if the array is sorted from Start Index to End
	public static boolean isSortedBetter(int input[], int startIndex) {
		if(startIndex == input.length-1) {
		return true;
	}
	if(input[startIndex]> input[startIndex+1]) {
		return false;
	}
	boolean smallAns = isSortedBetter(input, startIndex+1);
	return smallAns;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,3,6,7,9};
		System.out.println(isSortedBetter(input, 0));
	}

}
