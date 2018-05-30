package motionless;

public abstract class MotionlessElementsFactory {
	
	/** The Constant Wall_Vertical. */
	private Wall_Vertical WALL_VERTICAL = new Wall_Vertical();
	
	/** The Constant Wall_Horizontal. */
	private Wall_Horizontal WALL_HORIZONTAL = new Wall_Horizontal();
	
	/** The Constant Wall. */
	private Wall WALL = new Wall();
	
	/** The Constant Floor. */
	private Floor FLOOR = new Floor();
	
	/** The Constant Gate. */
	private Gate GATE = new Gate();
	
	/** The Constant Purse. */
	private Purse PURSE = new Purse();
	
	/** The Constant Key. */
	private Key KEY = new Key();
	
	/** The motionless elements is an array of all possible MotionlessElement. . */
	private MotionlessElement[] motionlessElements = {WALL_VERTICAL, WALL_HORIZONTAL, WALL, FLOOR, GATE, PURSE, KEY};
	
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	
	public MotionlessElement creatWall_Vertical() {
		return WALL_VERTICAL;	
	}
	
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	
	public MotionlessElement creatWall_Horizontal() {
		return WALL_HORIZONTAL;	
	}
	
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	
	public MotionlessElement creatWall() {
		return WALL;	
	}
	
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	
	public MotionlessElement creatFloor() {
		return FLOOR;	
	}
	
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	
	public MotionlessElement creatGate() {
		return GATE;	
	}
}
