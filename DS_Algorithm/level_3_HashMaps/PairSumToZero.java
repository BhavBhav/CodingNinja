package level_3_HashMaps;

import java.util.HashMap;

public class PairSumToZero {

	public static void PairSum(int[] input, int size) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : input) {
			if(map.containsKey(i)) {
				int freq = map.get(i);
				freq++;
				map.put(i, freq);
			}
			else map.put(i, 1);
		}
		findPairSum(map, input);
	}

	public static void findPairSum(HashMap<Integer, Integer> map , int[] arr) {
		for (int i : arr) {
			if(map.containsKey(i)) {
				int freqFirstNumber = map.get(i);
				int reqPair = 0 - i;
				if(map.containsKey(reqPair)){
					int freqSecondNumber = map.get(reqPair);
					for(int i1 = 1 ; i1 <= freqFirstNumber*freqSecondNumber; i1++ ) {
						if(i > reqPair) {
							System.out.println(reqPair + " " + i);
						}
						else System.out.println(i + " " + reqPair);
					}
					map.put(i, 0);
					map.put(reqPair, 0);
				}
			}
		}

	}



	public static void main(String[] args) {
		int[] arr = {1,-2,2,6,5,-6,2,5};
		PairSum(arr, arr.length);
	}

}
