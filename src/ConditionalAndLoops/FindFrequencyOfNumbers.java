package ConditionalAndLoops;

import java.util.HashMap;

public class FindFrequencyOfNumbers {

	public static void main(String[] args) {
		int[] arr = {2,5,2,5,4,1,6,3,5};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int key :arr) {
			
			if(map.containsKey(key))
			map.put(key, 1);
		}
	}

}
