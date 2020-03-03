package level_3_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(int[] arr){
		ArrayList<Integer> arrList = new ArrayList<>();
		HashMap<Integer, Boolean> seen = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(seen.containsKey(arr[i])) {
				continue;
			}
			arrList.add(arr[i]);
			seen.put(arr[i], true);
		}
		return arrList;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,5,32,5,1,1000,5,2,32};
		ArrayList<Integer> arrList = removeDuplicates(arr);
		for(int i : arrList) {
			System.out.println(i);
		}
	}
}
