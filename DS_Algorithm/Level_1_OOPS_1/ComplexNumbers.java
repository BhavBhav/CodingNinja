package Level_1_OOPS_1;

public class ComplexNumbers {
	private int real1;
	private int imaginary1;
	public int getImaginary1() {
		return imaginary1;
	}
	public void setImaginary1(int imaginary1) {
		this.imaginary1 = imaginary1;
	}

	public void setRea1(int real1) {
		this.real1= real1;
	}
	public int getReal1() {
		return real1;
	}
	
	public ComplexNumbers(int real1,int imaginary1) {
		this.real1= real1;
		this.imaginary1= imaginary1;
		
	}
	public void print() {
		System.out.println(this.real1 + " "+ "+" + " "+"i"+this.imaginary1);
		
	}
	public  void plus(ComplexNumbers c2) {
		this.real1 = this.real1+c2.real1;
		this.imaginary1= this.imaginary1+c2.imaginary1;
		
	}
	public void multiply(ComplexNumbers c2) {
		int a=this.real1;
		this.real1= (this.real1*c2.real1) - (this.imaginary1*c2.imaginary1);
		this.imaginary1= (a*c2.imaginary1)+(this.imaginary1*c2.real1);
		
		
		
	
	}
	
}
