package Element.mobile.auto;

import model.IMap;
import model.Sprite;

public class Monster_2 extends Monster {
	/**
	 * Create a sprite for the monster
	 */
	private static Sprite sprite = new Sprite('w', "monster_2");
	
	public boolean goingRight = true;

	/**
	 *  Instantiate a new Monster
	 * @param level
	 * @param x
	 * @param y
	 */
	public Monster_2(IMap level, int x, int y) {
		super(sprite, level, x, y);
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
	}

	/** AI Horizontal */
	@Override
	public void move() {
		if(this.goingRight) {
			if(!this.moveRight()) {
				this.moveLeft();
				goingRight = false;
			}
		}
		else {
			if(!this.moveLeft()) {
				this.moveRight();
				goingRight = true;
			}
		}
	}

	@Override
	public int collect() {
		// TODO Auto-generated method stub
		return 0;
	}
}