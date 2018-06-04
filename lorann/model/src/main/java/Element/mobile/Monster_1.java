package Element.mobile;

import model.IMap;
import model.Sprite;

public abstract class Monster_1 extends Monster {
	
	private static Sprite sprite = new Sprite('z', "monster_1");
	
	public boolean goingUp = true;

	public Monster_1(IMap level, int x, int y) {
		super(sprite, level, x, y);
	}

	@Override
	public void doNothing() {
	}

	@Override
	public int collect() {
		return 0;
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
}
