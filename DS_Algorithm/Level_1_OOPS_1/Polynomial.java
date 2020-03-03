package Level_1_OOPS_1;

public class Polynomial {
	private int[] degree1;
	private int[] coeff1;
	public static int x;
	private int degree;
	private int coeff;
	public static int x1;
	
	   int degreecoeff[];

	    public Polynomial()
	    {
	        degreecoeff = new int[100];
	    }
	
public void setCoefficient(int degree, int coeff){
		//this.degree = degree;
		if(degree>degreecoeff.length-1) {
			this.degreecoeff = new int[degree];
		}
		degreecoeff[degree]=coeff;
		
}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i=0; i<degreecoeff.length;i++) {
			if(degreecoeff[i]==0) {
				
			}
			else {
				System.out.print(degreecoeff[i]+"X"+i+" ");
			}
		}
		
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		for(int i=0; i<degreecoeff.length;i++) {
			
			p.degreecoeff[i]=degreecoeff[i]+p.degreecoeff[i];
		}
		return p;
		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		for(int i=0; i<degreecoeff.length;i++) {
			
			p.degreecoeff[i]=degreecoeff[i]-p.degreecoeff[i];
		}
		return p;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		for(int i=0; i<degreecoeff.length;i++) {
			for(int j=0; j<degreecoeff.length;j++) {
				
			p.degreecoeff[i]=(p.degreecoeff[i])+(degreecoeff[i]*p.degreecoeff[j]);
		}
		}
		return p;
	}
}
