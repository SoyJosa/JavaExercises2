package One;

import java.util.*;


public class GenericUtility <T extends Circle> {
	//a generic function to sort circles by area descending
	public List<T> sortCircle(List<T> circleArea){
		circleArea.sort((o1,o2) -> (int) (o2.getArea() - o1.getArea()));
		
		return circleArea;
	}
	
	//a generic function to search by area
	public Circle searchArea(List<T> circles, double x) {
		Circle circle = circles.stream()
				.filter(o -> o.getArea() == x )
				.findAny()
				.orElse(null);
		return circle;
	}
	
	//a generic function to convert a collection to an array of the same type
	public Circle[] listToArray(List<T> circles) {
		Circle[] circleArray = new Circle[circles.size()];
		circles.toArray(circleArray);
		
		return circleArray;		
	}
	
	//a generic function to CONVERT all the circles to Resizable circles ordering by perimeter or area DESC
	public List<ResizableCircle> tosortResizable(List<T> circles){
		@SuppressWarnings("unchecked")
		List<ResizableCircle> circleR = (List<ResizableCircle>) sortCircle(circles);
				
		return circleR;
	}
	
	//a generic function that accepts an iterable attribute to retrieve false or true if a circle element exists:
	public boolean exist(Iterable<T> circles, Circle circle) {
		boolean result = false;
		
		Iterator<T> iterator = circles.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().equals(circle)){
				result = true;
				break;
			}
		}
		
		return result;
	}
	

}
