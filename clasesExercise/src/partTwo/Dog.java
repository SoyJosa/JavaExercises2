package partTwo;

public class Dog extends Animal{
	
	
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void greets() {
		// TODO Auto-generated method stub
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		Dog uno = another;
		uno.greets();
		System.out.println("Woooof");
	}	
	

}
