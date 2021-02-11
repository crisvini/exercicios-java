package entities;

public class Rectangle {

	public double width, height;
	
	public double area() {
		
		return width * height;
		
	}
	
	public double perimeter() {
		
		return (width + height) * 2;
		
	}
	
	public double diagonal() {
		
		double c = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(c);
		
	}
	
	public String toString() {
		
		return "Area: " 
				+ area()
				+ "\nPerimeter: "
				+ perimeter()
				+ "\nDiagonal: "
				+ diagonal();
		
	}

}
