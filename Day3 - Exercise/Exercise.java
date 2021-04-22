package Day3;

public class Exercise {
	//Exercise One
	public static double[] SumAverage(int[] array) {
		double[] x = new double[2];
		
		for(int i = 0;i<array.length;i++) {
			x[0] += array[i];			
		}
		x[1] = x[0]/array.length;
		
		return x;
	}
	
	//Exercise Two
	public static int Sum(int[] array) {
		int x = 0;
		
		for(int i = 0;i<array.length;i++) {
			x += array[i];			
		}
		
		return x;
	}
	
	//Exercise Three
	public static int SumPositive(int[] array) {
		int i = 0;
		int x = 0;
		
		while(array [i] > 0) {
			x += array [i];	
			i++;
		}
		
		return x;		
	}
	
	//Exercise Five
	enum Months{
		January, February, March, April, May, June, July, August, September, October, November, December
	}
	
	public static void enumMonth() {
		Months[] enumArray = Months.values();
		
		for(int i = 0; i < enumArray.length ; i++) {
			System.out.println(enumArray[i]);
		}		
	}
	
	//Exercise Six
	enum WeekDay{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}
	
	public static void enumWeekday(WeekDay X) {
		WeekDay enumArray = X;
		
		switch(enumArray) {
		case Monday:
			System.out.println("Today is Monday");
			break;
		case Tuesday:
			System.out.println("Today is Tuesday");
			break;
		case Wednesday:
			System.out.println("Today is Wednesday");
			break;
		case Thursday:
			System.out.println("Today is Thursday");
			break;
		case Friday:
			System.out.println("Today is Friday");
			break;
		case Saturday:
			System.out.println("Today is Saturday");
			break;
		case Sunday:
			System.out.println("Today is Sunday");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		//Exercise 1
		System.out.println("Exercise 1\nInput: {2, -9, 0, 5, 12, -25, 22, 9, 8, 12}");
		int[] x = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		double[] y = SumAverage(x);
		System.out.println("Sum: "+y[0]);
		System.out.println("Average: "+ y[1]);
		System.out.println();
		
		//Exercise 2
		System.out.println("Exercise 2\nInput: {3, 4, 5, -5, 0, 12}");
		int[] i = {3, 4, 5, -5, 0, 12};
		System.out.println("Result: "+Sum(i));
		System.out.println();
		
		//Exercise 3
		System.out.println("Exercise 3\nInput: {25, 9, 5, -3}");
		int[] j = {25, 9, 5, -3};
		System.out.println("Result: "+SumPositive(j));
		System.out.println();
		
		//Exercise 4
		System.out.println("Exercise 4\nD. The first line of output is abcd abc false");
		System.out.println("F. The second line of output is abcd abcd true");
		System.out.println();
		
		//Exercise 5
		System.out.println("Exercise 5\nMonths: ");
		enumMonth();
		System.out.println();
		
		//Exercise 6
		System.out.println("Exercise 6");
		enumWeekday(WeekDay.Thursday);
		System.out.println();
		
		//Exercise 7
		System.out.println("Exercise 7");
		System.out.println("I don't have clear what the loop for is doing, but the last two lines\n"
				+ "will print the third position of the array and that will be \"WED\""
				);
		
		
	}

}
