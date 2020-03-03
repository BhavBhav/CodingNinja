package StringAnd2DArray;

public class CompressString_2 {
	
	public static void compress(String inputString) {
		int a=0;
		for (int i=0; i<inputString.length()-1;i++) {
			for (int j=i+1; i<inputString.length()-2;j++) {
			if (inputString.charAt(i)==inputString.charAt(j)) {
				a++;
				
			}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
