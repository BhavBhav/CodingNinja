package StringAnd2DArray;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String input) {
		String output =  " ";
		   int k=0; int j=0;
		   
	       for(int i=0;i<input.length();i++) {
	    	   
	    	  
	    	   if(input.charAt(i)!=output.charAt(j)) {
	    		   output = output+input.charAt(i);
	    		   j++;
	    	   }
	       }
		    return output.trim();
		}
	public static void main(String[] args) {
		String out = removeConsecutiveDuplicates("aaabccbaaaaaaa");
		System.out.println(out);
	}

}
