package amazonInterviewPreparation;

import java.util.HashMap;

public class FindUniqueInArray {

	public static int uniqueByHashMap(int[] arr) {


		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i : arr) {
			if(map.containsKey(i)) {
				int freq = map.get(i);
				freq++;
				map.put(i, freq);
			}
			else map.put(i, 1);
		}
		int ans = 1;
		for(int i : map.keySet()) {
			if(map.get(i).equals(1)) {
				ans = i;
			}
		}

		return ans;
	}

	public static int uniqueByIteration(int[] arr) {
		System.out.println("--------By iteration---------------");
		int j =0;
		for (int i = 0; i < arr.length; i++) {
			j=0;
			for (int k = 0; k < arr.length; k++) {
				if(i != k) {
					if(arr[i] == arr[k]) {
						j++;
						break;
					}

				}
			}
			if(j == 0) {
				j = arr[i];
				return j;
			}

		}
		return Integer.MAX_VALUE;

	}
	


	public static int findUniueIteration(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i != j) {
					if(arr[i] == arr[j]) {
						break;
					}else {
						if(j==arr.length-1) {
							if(arr[i] == arr[j]) {
								break;
							}
							else {
								temp = arr[i];
							}
						}
						continue;
					}
				}

			}

		}
		return temp;

	}



	public static void main(String[] args) {
		int[] arr = {1,4,1,3,3,0,4,0,8};
		//System.out.println(uniqueByHashMap(arr));
		System.out.println(uniqueByIteration(arr));
	}

}
