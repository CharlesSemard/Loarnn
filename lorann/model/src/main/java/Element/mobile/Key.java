package Element.mobile;

import java.io.IOException;

import model.IMap;
import model.Permeability;
import model.Sprite;

public class Key extends Mobile {
	/** The  SPRITE. */
	private static Sprite ballSprite = new Sprite('u', "crystal_ball");
	private static Sprite collected = new Sprite('u', "floor");
	
	/**
	 * Create the key
	 * @param x
	 * @param y
	 * @param level
	 * @throws IOException
	 */
	public Key(int x, int y, IMap level) throws IOException {
		super(ballSprite, Permeability.COLLECTIBLE, level, x, y);
		collected.loadImage();
	}

    /**
     * Do nothing.
     */
	
	@Override
	public void doNothing() {}
	
    /**
     * when the hero passes on a key
     * this key is destroyed and the door open 
     * @return the open door  
     */	
	public int collect() {
		if(this.isAlive()) {
			this.die();
		}
		return 0;
	}
	
    /**
     * when the hero passes on a key
     * this key is destroyed   
     */	
	
	@Override
	public void die() {
		super.die();
		this.setSprite(collected);
		this.setHasMoved();
	}

}
