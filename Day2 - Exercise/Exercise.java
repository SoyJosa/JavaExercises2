import java.util.Scanner;

public class Exercise {
	
	//Exercise One
	public static int countVowels(String word) {
		word = word.toLowerCase();
		int x =0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				x += 1;				
			}
		}
		return x;
	}
	
	//Exercise Two
	public static int countWords(String word) {
		String[] o = word.split(" ");
		
		int x = o.length;
		
		return x;
	}
	
	//Exercise three
	public static int sumDigits(int x) {
		
		char[] number = (String.valueOf(x).toCharArray());
		int sum = 0;
		
		for(int i = 0;i<number.length; i++) {
			sum += Character.getNumericValue(number[i]);
		}
		
		return sum;
	}
	
	// Exercise four
	public static void pentagonalNumber() {
		for(int i = 1;i<=50;i++) {
			int x = ((3 * (i*i))-i)/2;
			
			System.out.print(x + " ");
			if(i%10 == 0) {
				System.out.println();
			}
		}
	}
	
	// Exercise five
	public static boolean leapYear(int year) {
		if(year%4 == 0 && year%400 == 0) {
			return true;
		}else {
			return false;
		}
	}
		
	// Exercise six
	public static void futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int year) {
		monthlyInterestRate /= 12;
		System.out.println("Years    FutureValue");
		for(int i = 1;i<= year;i++) {
			double x = investmentAmount * Math.pow(1 + monthlyInterestRate, i * 12);
			System.out.printf(i +"%18.2f\n",x);
		}
	}

	
	
	public static void main(String[] args) {

		//Exercise One
		System.out.println("Exercise 1\nInput the string: w3resource");
		System.out.println("Number of  Vowels in the string: " + countVowels("w3resource"));
		System.out.println();
		
		//Exercise Two
		System.out.println("Exercise 2\nInput the string: The quick brown fox jumps over the lazy dog.");
		System.out.println("Number of words in the string: " + countWords("The quick brown fox jumps over the lazy dog."));
		System.out.println();
		
		//Exercise Three
		System.out.println("Exercise 3\nInput an integer: 25");
		System.out.println("The sum is " + sumDigits(25));
		System.out.println();
		
		//Exercise Four
		System.out.println("Exercise 4\nThe first 50 pentagonal numbers.");
		pentagonalNumber();
		System.out.println();
		
		//Exercise Five
		Scanner scanner = new Scanner(System.in);
		System.out.print("Exercise 5\nInput a year: ");
		int year = scanner.nextInt();
		scanner.close();
		System.out.println(leapYear(year));
		System.out.println();
		
		//Exercise Six
		System.out.println("Exercise 6\nInput the investment amount: 1000");
		System.out.println("Input the rate of interest: 10");
		System.out.println("Input number of years: 5");
		double investmentAmount = 1000;
		double rate = 10;
		int year1 = 5;
		rate *= 0.01;
		futureInvestmentValue(investmentAmount, rate, year1);
		
	}

}
