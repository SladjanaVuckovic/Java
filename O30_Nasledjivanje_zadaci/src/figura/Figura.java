package figura;

public abstract class Figura {
	
	protected double xRef, yRef;
	
	public Figura(double xRef, double yRef) {
		if(xRef ==0.0 || yRef==0.0)
			System.out.println("Greska");
		else
			this.xRef=xRef;
			this.yRef=yRef;
	}
	public abstract double obim();
	public abstract double povrsina();
	

}
