package level_3_HashMaps;

import java.util.HashMap;
import java.util.Set;

public class NumberFrequency {
	
	
	

	public static void main(String[] args) {
		int[] arr = {0,1,2,0,5,1,6,5,3,1,1,1,5,2};
		freq(arr);
		

	}

	private static void freq(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i : arr) {
			if(map.containsKey(i)) {
				int num = map.get(i);
				num++;
				map.put(i, num);
			}
			else {
				map.put(i, 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		for(int i : set) {
			System.out.println("freq of "+ i+" is  : " +map.get(i));
		}
		
	}

}
