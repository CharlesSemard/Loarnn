package Element.mobile;

import model.IMap;
import model.Sprite;

public abstract class Monster_1 extends Monster {
	
	private static Sprite sprite = new Sprite('x', "monster_1");
	
	public boolean goingUp = true;

	public Monster_1(IMap level, int x, int y) {
		super(sprite, level, x, y);
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
	}

	@Override
	public int collect() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*@Override
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
	}*/
}
