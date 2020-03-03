package level_3_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		int startMaster = arr[0], seriesLengthMaster = 1;
		ArrayList<Integer> arrayList = new ArrayList<>();
		HashMap<Integer,Boolean> map = new HashMap<>();
		for (int i :arr) {
			map.put(i, true);
		}

		for ( int j : arr) {
			if(map.get(j).equals(true)) {
				int seriesLength = 0;
				int  temp = j;
				while(map.containsKey(temp)) {
					map.put(temp , false);
					seriesLength++;
					temp += 1;
				}
				temp = j-1; int k = 0;
				while(map.containsKey(temp)) {
					map.put(temp , false);
					seriesLength++;
					temp -= 1;
					k=temp;
					
				}
				if (seriesLengthMaster < seriesLength){
					seriesLengthMaster = seriesLength;
					startMaster = k;
				}
			}
		}

		for(int i1 = 0; i1 < seriesLengthMaster; i1++) {
			arrayList.add(startMaster);
			startMaster += 1;

		}
		return arrayList;
	}

	public static void main(String[] args) {
		int[] arr = {2,12,9,3,5,16,10,5,20,25,11,7,1,8,6};
		ArrayList<Integer> list = longestConsecutiveIncreasingSequence(arr);
		for(int i : list) {
			System.out.println(i);
		}
	}

}
