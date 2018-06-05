package Element.mobile;

import java.awt.Point;

import model.IMap;
import Element.Element;
import model.IMobile;
import model.Permeability;
import model.Sprite;

public abstract class Mobile extends Element implements IMobile {
	
	/** The Speed */
	private int speed;
	/** Mobile alive */
	private Boolean alive = true;
	/** Position of element */	
	private Point position;
	/** The level on the map */	
	private IMap level;
	
	/**
	 * Record of the last move made
	 */
	protected int lastX = 0;
	/**
	 * Record of the last move made
	 */
	protected int lastY = 0;
	
	/** Refresh the map */	
	public void setHasMoved() {
		this.level.setElementHasChanged();
	}
	
    /**
     * Gets the moveUp.
     *
     * @return true or false for moveUp
     */
	@Override
	public boolean moveUp() {
		if(this.setY(this.getY() - 1)) {
			this.lastY = -1;
			this.lastX = 0;
			return true;
		}
		return false;
	}
	
    /**
     * Gets the moveDown.
     *
     * @return true or false for moveDown
     */	
	
	@Override
	public boolean moveDown() {
		if(this.setY(this.getY() + 1)) {
			this.lastY = 1;
			this.lastX = 0;
			return true;
		}
		return false;
	}
	
    /**
     * Gets the moveLeft.
     *
     * @return true or false for moveLeft
     */	

	@Override
	public boolean moveLeft() {
		if(this.setX(this.getX() - 1)) {
			this.lastX = -1;
			this.lastY = 0;
			return true;
		}
		return false;
	}

    /**
     * Gets the moveRight.
     *
     * @return true or false for moveRight
     */	
	@Override
	public boolean moveRight() {
		if(this.setX(this.getX() + 1)) {
			this.lastX = 1;
			this.lastY = 0;
			return true;
		}
		return false;
	}
    /**
     * Instantiates a new element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     * @param level
     * 			  the level on the map 
     */
	
	/**
	 * Gets the moveUpRight
	 * 
	 * @return true or false for moveUpRight
	 */
	
	@Override
	public boolean moveUpRight() {
		if(this.setY(this.getY() - 1)) {
			this.lastY = -1;
			this.lastX = 0;
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the moveDownLeft
	 * 
	 * @return true or false for moveDownLeft
	 */
	
	@Override
	public boolean moveDownLeft() {
		if(this.setY(this.getY() + 1)) {
			this.lastY = 1;
			this.lastX = 0;
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the moveUpLeft
	 * 
	 * @return true or false for moveUpLeft
	 */

	@Override
	public boolean moveUpLeft() {
		if(this.setX(this.getX() - 1)) {
			this.lastX = -1;
			this.lastY = 0;
			return true;
		}
		return false;
	}
	
	/**
	 * Gets the moveDownRight
	 * 
	 * @return true or flase for moveDownRight
	 */

	@Override
	public boolean moveDownRight() {
		if(this.setX(this.getX() + 1)) {
			this.lastX = 1;
			this.lastY = 0;
			return true;
		}
		return false;
	}
	
	
	/**
	 * Instantiates a new element
	 * 
	 * @param sprite
	 * @param permeability
	 * @param level
	 */
	public Mobile(Sprite sprite, Permeability permeability, IMap level) {
		this(sprite, permeability, level, 0, 0);
	}
	
    /**
     * Instantiates a new element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     * @param level
     * 			  the level on the map 
     * @param x
     *            the horizontal position
     * @param y
     *            the vertical position
     */

	public Mobile(Sprite sprite, Permeability permeability, IMap level, int x, int y) {
		super(sprite, permeability);
		this.level = level;
		this.position = new Point();
		this.getPosition().x = x;
		this.getPosition().y = y;
	}
	
	/**
	 * Gets the level
	 * @return the level
	 */
	protected IMap getLevel() {
		return this.level;
	}
	
	/**
	 * 
	 * @param newX
	 * @param newY
	 * @return the permeability is blocking or penetrable
	 */
	
	public boolean isOnWall(int newX, int newY) {
		return (this.getLevel().getOnTheMapXY(newX, newY).getPermeability() == Permeability.BLOCKING);
	}
	
	/**
	 * @return x
	 */
	@Override
	public int getX() {
		return this.getPosition().x;
	}
	/**
	 * 
	 * @param x
	 * @return true or false for the x 
	 */
	
	public boolean setX(int x) {
		if (!this.isOnWall(x, this.getY())) {
			this.getPosition().x = x;
			return true;
        }
		return false;
	}
	/**
	 * @return y
	 */
	@Override
	public int getY() {
		return this.getPosition().y;
	}
	/**
	 * 
	 * @param y
	 * @return true or false for the y
	 */
	
	public boolean setY(int y) {
		if (!this.isOnWall(this.getX(), y)) {
			this.getPosition().y = y;
			return true;
        }
		return false;
	}
	
	/**
	 * Initial the postion of hero
	 * @param x
	 */

	public void initX(int x) {
		this.getPosition().x = x;
	}
	
	/**
	 * Initial the postion of hero
	 * @param y
	 */
	
	public void initY(int y) {
		this.getPosition().y = y;
	}
	
	/**
	 * 
	 * @return speed
	 */
	
	public int getSpeed() {
		return speed;
	}
	/**
	 * check if the hero is alive 
	 * @return alive 
	 */
	
	@Override
	public boolean isAlive() {
		return this.alive;
	}
	/**
	 * @param newX
	 * @param newY
	 * @return the permeability 
	 */
	@Override
	public boolean isHit(int newX, int newY) {
		return (this.getLevel().getOnTheMapXY(newX, newY).getPermeability() == Permeability.MONSTER);
	}
	
	/**
	 * if the mobile element die the map is refresh
	 */
	
	protected void die() {
		this.alive = false;
	}
	/**
	 * the position on the map
	 * @return position
	 */	
	@Override
	public Point getPosition() {
		return this.position;
	}
	
	/**
	 * Spawn a Spell turning parameter alive (back) to true
	 */
	public void spawnSpell() {
		this.alive = true;
	}
	
	/**
	 * set the position for every object that will be updated
	 * 
	 * @param x
	 * @param y
	 * @return
	 */

	public boolean setPosition(int x, int y) {
		if(this.getLevel().getOnTheMapXY(x, y).getPermeability() != Permeability.BLOCKING) {
			this.getPosition().x = x;
			this.getPosition().y = y;
			return true;
		}
		return false;
	}
	
	/**
	 * Spawns a spell (@see MyCharacter class)
	 */
	public void shoot() {}
	
	/**
	 * Defines a generic method for the movement of the mobile element (@see monsters and spell)
	 */
	public void move() {}
}
