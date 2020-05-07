package amazonInterviewPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayIntersection {
	
	
	public static void arrayIntersectionHashMap(int[] arr1) {
		System.out.println("-----TRying sorting by Collections-----");
		List<Integer> list = new ArrayList<>();
		for(int i : arr1) {
			list.add(i);
		}
		Collections.sort(list);
		for( int i : list) {
		System.out.println(i);
		
		}
	}
	
	public static void arrayIntersectionIterative(int[] arr1, int[] arr2) {
		System.out.println("--------By iteration---------------");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j] ) {
					System.out.print(arr1[i]+" ");
					arr2[j] = Integer.MAX_VALUE;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr1 = {2,6,1,2,6};
		int[] arr2 = {1,2,3,4,2};
		//arrayIntersectionHashMap(arr1);
		//arrayIntersectionIterative(arr1, arr2);
		findSecondHighestNumber(arr1);
	}

	private static void findSecondHighestNumber(int[] arr1) {
		System.out.println("-----Trying to Find Second Largest Number-----");
		List<Integer> list = new ArrayList<>();
		for(int i : arr1) {
			list.add(i);
		}
		Collections.sort(list);
		int largest = list.get(list.size()-1);
		int temp= Integer.MIN_VALUE;
		for( int i : list) {
			if(i < largest) {
				if(i > temp) {
					temp = i ;
				}
			}
			
		
		}
		System.out.println("Second Largest Number is :"+ temp);
	}

}
