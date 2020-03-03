package Level_1_Subsequences;

public class SubSequenceReturnKeypadCode {
	
	public static String[] keypad(int n){
		if(n==0 || n==1) {
			String[] str = {""};
			return str;
		}
		int smallNum=n/10; int count= 0, checkNum= n;
		int rem = n%10;
		String[] smallArr;
		smallArr = keypad(smallNum);
		char[] arr1;
		if(n<10) {
			 arr1= helper(n);
			 int l=0;
			 for (int i = 0; i < arr1.length; i++) {
				smallArr[l] = ""+arr1[i];
				l++;
			}
			 return smallArr;
		}
		char[] charArr = helper(rem);
		String[] ansArr = new String[charArr.length*smallArr.length];
		int k=0;
		
			for (int j = 0; j < charArr.length; j++) {
				ansArr[k]= ""+charArr[j];
				k++;
			
		}
		
		
		return ansArr;
	}
	public static char[] helper(int n) {
		
		switch (n) {
		
		case 2:
			char[] charArr1= {'a','b','c'};
			return charArr1;
		case 3:
			char[] charArr2= {'d','e','f'};
			return charArr2;
		case 4:
			char[] charArr4= {'g','h','i'};
			return charArr4;
		case 5:
			char[] charArr5= {'j','k','l'};
			return charArr5;
		case 6:
			char[] charArr6= {'m','n','o'};
			return charArr6;
		case 7:
			char[] charArr7= {'p','q','r','s'};
			return charArr7;
		case 8:
			char[] charArr8= {'t','u','v'};
			return charArr8;
		case 9:
			char[] charArr9= {'w','x','y','z'};
			return charArr9;

		default:
			
			break;
		}
		char[] charArr0= {};
		return charArr0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = keypad(23);
		for(int i=0; i< str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
