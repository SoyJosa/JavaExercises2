package partTwo;

public class BigDog extends Dog{

	public BigDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void greets() {
		// TODO Auto-generated method stub
		System.out.println("Wooow");
	}
	
	@Override
	public void greets(Dog another) {
		Dog uno = another;
		uno.greets();
		System.out.println("Wooooow");
	}
	
	public void greets(BigDog another) {
		BigDog uno = another;
		uno.greets();
		System.out.println("Woooooooow");
	}
}
