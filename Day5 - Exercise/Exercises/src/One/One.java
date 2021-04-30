package One;

import java.util.Random;  
import java.util.ArrayList;
import java.util.List;

public class One<T extends Circle> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* A */
		List<Circle> list = new ArrayList<>();
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			int x = random.nextInt(25);
			list.add(new Circle(x));
		}
		int x = 10;
		list.add(new Circle(x));
		
		System.out.println("Size of the list: " +list.size());
		
		for(Circle o:list) {
			System.out.println(o.toString());
		}
		
		/* B */
		
		GenericUtility<Circle> UNO = new GenericUtility<Circle>();
		
		// i.
		System.out.println("\n\nSorted list: ");
		list = UNO.sortCircle(list);
		for(Circle o:list) {
			System.out.println(o.getArea());
		}
		
		//ii.
		double area =  Math.PI * Math.pow(x, 2);
		area = Math.round(area*100.0)/100.0;
		Circle circle2 = UNO.searchArea(list, area);
		System.out.println("\n\nArea: " + area);
		System.out.println("Circle founded: " + circle2.toString());
		
		//iii.
		System.out.println("\n\nCollection To Array");
		Circle[] DOS = UNO.listToArray(list);
		for(Circle o:DOS) {
			System.out.println(o.toString());
		}
		
		//iv.
		System.out.println("\n\nConver circles to Resizable Circles");
		List<ResizableCircle> list2 = UNO.tosortResizable(list);
		for(Circle o:list2) {
			System.out.println(o.toString());
		}
		
		//v.
		System.out.println();
		System.out.println();
		System.out.println(list.get(0).toString() + " exists?");
		System.out.println(UNO.exist(list, list.get(0)));
		

		
		
	}



}
