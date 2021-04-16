package partThree;

public class MovableCircle implements Movable{
	
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.radius = radius;
		this.center = new MovablePoint(x,y,xSpeed,ySpeed);
	}
	
	
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		System.out.println("Move up");
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		System.out.println("Move down");
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		System.out.println("Move left");		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		System.out.println("Move right");
	}

}
