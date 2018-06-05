package Element.mobile.auto;

import model.IMap;
import model.IMonster;
import model.Sprite;

public class Monster_1 extends Monster implements IMonster {
	
	/**
	 *  Sprite for the monster
	 */
	private static Sprite sprite = new Sprite('z', "monster_1");
	
	public boolean goingUp = true;

	/**
	 *  Instantiate a Monster
	 * @param level
	 * @param x
	 * @param y
	 */
	public Monster_1(IMap level, int x, int y) {
		super(sprite, level, x, y);
	}

	@Override
	public void doNothing() {
	}

	/** AI Vertical */
	@Override
	public void move() {
		if(this.goingUp) {
			if(!this.moveUp()) {
				this.moveDown();
				goingUp = false;
			}
		}
		else {
			if(!this.moveDown()) {
				this.moveUp();
				goingUp = true;
			}
		}
	}

	@Override
	public int collect() {
		// TODO Auto-generated method stub
		return 0;
	}
}
