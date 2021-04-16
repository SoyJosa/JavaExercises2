package partOne;

public class Circle implements GeometricObject{
	
	protected double radius;
	
	public Circle(double radiu){
		this.radius =	radiu;			
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double perimeter = 2 * 3.1416 * radius;
		
		return perimeter;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
