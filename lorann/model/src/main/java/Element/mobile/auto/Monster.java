package Element.mobile.auto;

import java.io.IOException;
import Element.mobile.Mobile;
import model.IMap;
import model.IMonster;
import model.Permeability;
import model.Sprite;

public abstract class Monster extends Mobile implements IMonster{

	/** Sprite of the monster when it's dead */
	private static Sprite deadSprite = new Sprite('.', "floor");

	/**
	 * Instantiates a new Monster
	 * @param sprite
	 * 		Sprite of the monster
	 * @param level
	 * 		The level in which the monster stands
	 * @param x
	 * 		X coordinate
	 * @param y
	 * 		Y coordinate
	 */
	public Monster(Sprite sprite, IMap level, int x, int y) {
		super(sprite, Permeability.MONSTER, level, x, y);
		try {
			deadSprite.loadImage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isHit() {
		if(this.getLevel().getOnTheMapXY(this.getX(), this.getY()) instanceof Spell) {
			return true;
		}
		return false;
	}
	
	public abstract void move();
	
	/** Makes the monster die */
	public int collect() {
		this.die();
		return 0;
	}
	
	@Override
	public void die() {
		super.die();
		this.setSprite(deadSprite);
	}
	
}
