package Element.mobile;

import model.IMap;
import model.Permeability;
import model.Sprite;

public abstract class Monster extends Mobile{


	Monster(Sprite sprite, IMap level, int x, int y) {
		super(sprite, Permeability.MONSTER, level, x, y);
	}
	
	public boolean isHit() {
		if(this.getLevel().getOnTheMapXY(this.getX(), this.getY()) instanceof Spell) {
			return true;
		}
		return false;
	}
}
