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
	
	private Point position;
	
	private IMap level;
	
	/**
	 * Record of the last move made
	 */
	private int lastX = 0;
	/**
	 * Record of the last move made
	 */
	private int lastY = 0;
	
	public void setHasMoved() {
		this.level.setElementHasChanged();
	}
	
	@Override
	public boolean moveUp() {
		if(this.setY(this.getY() - 1)) {
			this.lastY = -1;
			this.lastX = 0;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean moveDown() {
		if(this.setY(this.getY() + 1)) {
			this.lastY = 1;
			this.lastX = 0;
			return true;
		}
		return false;
	}

	@Override
	public boolean moveLeft() {
		if(this.setX(this.getX() - 1)) {
			this.lastX = -1;
			this.lastY = 0;
			return true;
		}
		return false;
	}

	@Override
	public boolean moveRight() {
		if(this.setX(this.getX() + 1)) {
			this.lastX = 1;
			this.lastY = 0;
			return true;
		}
		return false;
	}
	
	public Mobile(Sprite sprite, Permeability permeability, IMap level) {
		this(sprite, permeability, level, 0, 0);
	}

	public Mobile(Sprite sprite, Permeability permeability, IMap level, int x, int y) {
		super(sprite, permeability);
		this.level = level;
		this.position = new Point();
		this.getPosition().x = x;
		this.getPosition().y = y;
	}
	
	protected IMap getLevel() {
		return this.level;
	}
	
	public boolean isOnWall(int newX, int newY) {
		return (this.getLevel().getOnTheMapXY(newX, newY).getPermeability() == Permeability.BLOCKING);
	}
	
	@Override
	public int getX() {
		return this.getPosition().x;
	}
	
	public boolean setX(int x) {
		if (!this.isOnWall(x, this.getY())) {
			this.getPosition().x = x;
			return true;
        }
		return false;
	}

	@Override
	public int getY() {
		return this.getPosition().y;
	}
	
	public boolean setY(int y) {
		if (!this.isOnWall(this.getX(), y)) {
			this.getPosition().y = y;
			return true;
        }
		return false;
	}

	public void initX(int x) {
		this.getPosition().x = x;
	}
	
	public void initY(int y) {
		this.getPosition().y = y;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	@Override
	public boolean isAlive() {
		return this.alive;
	}
	
	@Override
	public boolean isHit(int newX, int newY) {
		return (this.getLevel().getOnTheMapXY(newX, newY).getPermeability() == Permeability.MONSTER);
	}
	
	protected void die() {
		this.alive = false;
		this.setHasMoved();
	}
	
	@Override
	public Point getPosition() {
		return this.position;
	}

	@Override
	public void shoot() {
		int x = this.getX() - lastX;
		int y = this.getY() - lastY;
		this.level.setSpellOnTheMapXY(x, y, new Spell(this.getLevel(), x, y));
	}
	
}
