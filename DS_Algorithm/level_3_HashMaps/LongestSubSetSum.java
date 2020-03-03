package level_3_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubSetSum {

	public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		HashMap<Integer, Integer> map =new  HashMap<>();
		int sum = 0; int lengthLocal = 0;
		int l = arr.get(0);
		for( int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
			if(map.containsKey(sum)) {
				int oldIndex = map.get(l);
				int length = ((i+1) - oldIndex)-1;

				if (length > lengthLocal ) {
					lengthLocal = length;
				}
			}


			map.put(sum , i+1);

		}
		return lengthLocal;
	}

	public static void main(String[] args) {
		int[] arr = {95,-97,-387,-435,-5,-70,897,127,23,284};
		ArrayList<Integer> al = new ArrayList<>();
		for (int i : arr) {
			al.add(i);
		}
		System.out.println(lengthOfLongestSubsetWithZeroSum(al));

	}

}
