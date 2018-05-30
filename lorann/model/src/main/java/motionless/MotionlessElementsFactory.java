package motionless;

public abstract class MotionlessElementsFactory {
	
	private Wall_Vertical WALL_VERTICAL = new Wall_Vertical();
	private Wall_Horizontal WALL_HORIZONTAL = new Wall_Horizontal();
	private Wall WALL = new Wall();
	private Floor FLOOR = new Floor();
	private Gate GATE = new Gate();
	private MotionlessElement[] motionlessElements = {WALL_VERTICAL, WALL_HORIZONTAL, WALL, FLOOR, GATE};
	
	public MotionlessElement creatWall_Vertical() {
		return WALL_VERTICAL;	
	}
	
	public MotionlessElement creatWall_Horizontal() {
		return WALL_HORIZONTAL;	
	}
	
	public MotionlessElement creatWall() {
		return WALL;	
	}
	
	public MotionlessElement creatFloor() {
		return FLOOR;	
	}
	
	public MotionlessElement creatGate() {
		return GATE;	
	}
}
