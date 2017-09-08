/**
 * Aidan Scannell
 * Duel Enrollment
 */


public class Quadratic {

private double a;
private double b;
private double c;

	

	Quadratic(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double discriminant(){
		return Math.pow(b, 2)-4*a*c;
		
	/*	try {
			d = Mat
		}catch {ArithmaticException e}{
			
		}*/
		
	}
	
	public double[] roots() {
		double[] allroots;
		double d = discriminant();
		
		if (d < 0) return null;
		if (d == 0) {
			allroots = new double [1];
			all
		}
	}
	
}
