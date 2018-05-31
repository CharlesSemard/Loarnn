package mobile;

public abstract class Mobile {

	/** The X */
	private int x;
	
	/** The Y */
	private int y;
	
	/** The Speed */
	private int speed;
	
	private Boolean alive = true;
	
	protected void die() {
		this.alive = false;
		// faire une fonction pour reset la map
	}
}
