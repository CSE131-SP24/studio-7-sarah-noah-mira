package studio7;

public class Rectangle {
	
	private double length, width; //these are instance variables
	//we declare them outside of the method, and you can use them without parameters
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public double Area() {
		return this.length*this.width;
	}
	public double Perimeter() {
		return 2*(this.length)+2*(this.width);
	}
	public boolean Compare(Rectangle R2) {
		if(this.Area()>R2.Area()) {
			return true;
		}
		else {
		return false;
		}
		
	}
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(1,3); //creates a new instance of the object
		Rectangle R2 = new Rectangle(2,6);
		System.out.print(R1.Compare(R2));//calls Compare method and prints return
	}
	

}
