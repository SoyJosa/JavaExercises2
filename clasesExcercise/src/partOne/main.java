package partOne;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle1 = new Circle(10);
		
		System.out.println("Area: " + circle1.getArea());
		System.out.println("Perimeter: " + circle1.getPerimeter());
		
		circle1.toString();
		
		ResizableCircle circle2 = new ResizableCircle(10);
		
		System.out.println(circle2.toString());
		circle2.resize(50);
		System.out.println(circle2.toString());

	}

}
