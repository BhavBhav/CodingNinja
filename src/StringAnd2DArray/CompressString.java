package StringAnd2DArray;

public class CompressString {
	
	public static String compress(String inputString) {
		String str = "";
		int a=1;
		int num=0;
		for (int i=0; i<inputString.length()-1;i++) {
			if(i==inputString.length()-2) {
				str=str+inputString.charAt(i)+""+a;
				break;
			}
			
			if (inputString.charAt(i)==inputString.charAt(i+1)) {
				a++;
			}
			else {
				if(a==1) {
					str=str+inputString.charAt(i);
				}
				else {
				str=str+inputString.charAt(i)+""+a;
				}
				a=1;
			}
		}
		
			
		
		
		return str;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("aaaaccsttt"));
	}

}
