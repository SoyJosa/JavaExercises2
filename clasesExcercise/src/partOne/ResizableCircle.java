package partOne;

public class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radiu) {
		super(radiu);
		// TODO Auto-generated constructor stub
	}	

	@Override
	public String toString() {
		return "ResizableCircle [radius=" + radius + "]";
	}

	@Override
	public void resize(int percent) {
		// TODO Auto-generated method stub
		
		super.radius *= percent / 100.0;
		
	}

}
