package StringAnd2DArray;

public class checkPermuatation {
	
	public static boolean isPermutation(String input1, String input2) {
	    int k=0;
	 //   int[] frequency= new int[256] ;
	    if(input1.length()==input2.length()) {
	    for (int i=0; i<input1.length();i++ ){
	    	for (int j=0; j<input2.length();j++ ){
        	if(input1.charAt(i)==input2.charAt(j)) {
        		input2.replace(input2.charAt(j), ' ');
        		k++;
        		break;
        	}
        	}
        }
	    	if (k==input1.length()) {
	    		return true;
	    	} else return false;
            	
	    }
	    else
        
        return false;
	}

	public static void main(String[] args) {
		boolean check = isPermutation("aabcd","dcaba");
		System.out.println(check);
	}

}
