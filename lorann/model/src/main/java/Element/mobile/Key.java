package Element.mobile;

import java.io.IOException;

import model.IMap;
import model.Permeability;
import model.Sprite;

public class Key extends Mobile {
	/** The  SPRITE. */
	private static Sprite ballSprite = new Sprite('u', "crystal_ball");
	private static Sprite collected = new Sprite('u', "floor");
	
	public Key(int x, int y, IMap level) throws IOException {
		super(ballSprite, Permeability.COLLECTIBLE, level, x, y);
		collected.loadImage();
	}

	@Override
	public void doNothing() {}
	
	public int collect() {
		if(this.isAlive()) {
			this.die();
		}
		return 0;
	}
	
	@Override
	public void die() {
		super.die();
		this.setSprite(collected);
	}

}
