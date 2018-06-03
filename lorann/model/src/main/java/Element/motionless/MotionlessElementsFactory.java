package Element.motionless;

public abstract class MotionlessElementsFactory {
	
	/** The Constant Wall_Vertical. */
	private static Wall_Vertical WALL_VERTICAL = new Wall_Vertical();
	
	/** The Constant Wall_Horizontal. */
	private static Wall_Horizontal WALL_HORIZONTAL = new Wall_Horizontal();
	
	/** The Constant Wall. */
	private static Wall WALL = new Wall();
	
	/** The Constant Floor. */
	private static Floor FLOOR = new Floor();
	
	/** The Constant Gate. */
	private static Gate GATE = new Gate();
	
	/** The motionless elements is an array of all possible MotionlessElement. . */
	private static MotionlessElement[] motionlessElements = {WALL_VERTICAL, WALL_HORIZONTAL, WALL, FLOOR, GATE};
	
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	
	public static MotionlessElement creatWall_Vertical() {
		return WALL_VERTICAL;	
	}
	
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	
	public static MotionlessElement creatWall_Horizontal() {
		return WALL_HORIZONTAL;	
	}
	
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	
	public static MotionlessElement creatWall() {
		return WALL;	
	}
	
    /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	
	public static MotionlessElement creatFloor() {
		return FLOOR;	
	}
	
	 /**
     * Creates a new MotionlessElements object.
     *
     * @return the motionless element
     */
	public static MotionlessElement creatGate() {
		return GATE;	
	}
	
	/**
     * Gets the good MotionlessElement from the file.
     *
     * @param fileSymbol
     *            the file symbol
     * @return the from file
     */
    public static MotionlessElement getSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return FLOOR;
    }
}
