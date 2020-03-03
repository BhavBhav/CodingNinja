package StringAnd2DArray;

public class HIghestOccuringWord {
	
	public static char highestOccuringCharacter(String inputString) {
		int k = Integer.MIN_VALUE;
		int flagMin = Integer.MIN_VALUE;
		int flag=0; 
		char high = ' ';
		char highest = ' ';
        for(int i=0; i<inputString.length();i++){
        	flag=0;
            for(int j=i+1; j<inputString.length();j++){
                if(inputString.charAt(i)==inputString.charAt(j)) {
                	flag++;
                	high = inputString.charAt(i);
                }
        }
            if(flag>flagMin) {
            	flagMin=flag+1;
            	highest = high;
            }
            
        }
        
        return highest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(highestOccuringCharacter("kannu mittal ankush singla"));
	}

}
