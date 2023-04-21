package abstraction;
abstract class Shape{
	abstract double CalculateArea();
}
class Circles extends Shape{
	private double n;
	public Circle(double n) {
		this.n= n;
	}
	public double CalculateArea() {
		return 3.14*n*n;
	}
}

class Rectangle extends Shape{
	private double l;
	private double w;
	public Rectangle (double l, double w) {
		this.l=l;
		this.w=w;
	}
	public double CalculateArea() {
		return l*w;
	}
	
}
