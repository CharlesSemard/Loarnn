package Element.mobile;

import java.io.IOException;

import model.IMap;
import model.Permeability;
import model.Sprite;

public class Purse extends Mobile {
	/** The SPRITES */
	private static final Sprite purse = new Sprite('i',"purse");
	private static Sprite collected = new Sprite('i', "floor");
	
	/** Instantiates a new Purse. */
	private static int points = 10;
	
	public Purse(int x, int y, IMap level) throws IOException {
		super(purse, Permeability.COLLECTIBLE, level, x, y);
		collected.loadImage();
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub

	}
	
	public int collect() {
		if(this.isAlive()) {
			this.die();
			return points;
		}
		return 0;
	}
	
	@Override
	public void die() {
		super.die();
		this.setSprite(collected);
		this.setHasMoved();
	}
}