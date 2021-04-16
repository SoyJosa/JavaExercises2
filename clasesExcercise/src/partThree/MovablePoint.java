package partThree;

public class MovablePoint implements Movable{
	
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed){
		this.x =x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
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
