package Level_1_OOPS_1;

import java.util.Scanner;

public class polynomialClassPractice {
	public static int[] degree1;
	public static  int[] coeff1;
	public static int x;
	private int degree;
	private int coeff;
	public static int x1;
	
	public void setCoefficient(int degree, int coeff){
		if(this.degree==degree) {
			this.coeff= coeff;
			
		}
		this.degree= degree;
		this.coeff= coeff;
			
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		polynomialClassPractice first = new polynomialClassPractice();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree2[i],coeff2[i]);
		}
		for(int i = 0; i < n; i++){
			System.out.print(coeff1[i]+""+"x"+""+ degree1[i]+" ");
		}

	}

}
