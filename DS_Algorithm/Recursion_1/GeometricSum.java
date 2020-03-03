package Recursion_1;

public class GeometricSum {
	
	public static int pow(int k) {
		int num=1;
		if (k==0) {
			return 1;
		}
		while(k>=1) {
			num=num*2;
			k--;
		}
		return num;
	}
	
	public static double findGeometricSum(int k){
		
		if (k==0) {
			return 1.0;
		}
		int num=pow(k);
		
		double  smallSum =(double) 1/num ;
		
		return  smallSum + findGeometricSum(k-1);
	}

	public static void main(String[] args) {
		//double d = 0;
		//d=(double) 1/(2*1);
				
		System.out.println(findGeometricSum(4));
		//System.out.println(pow(5));

	}

}
