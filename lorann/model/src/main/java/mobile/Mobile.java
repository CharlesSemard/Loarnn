package mobile;

public abstract class Mobile {

	/** The X */
	private int x;
	
	/** The Y */
	private int y;
	
	/** The Speed */
	private int speed;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public Boolean getAlive() {
		return alive;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	private Boolean alive = true;
	
	protected void die() {
		this.alive = false;
		// faire une fonction pour reset la map
	}
}
