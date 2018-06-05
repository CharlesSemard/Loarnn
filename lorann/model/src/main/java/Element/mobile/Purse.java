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
	
    /**
     * Instantiates a new purse.
     * 
     * Generate the sprite of the hero
     *
     * @param x
     *            the horizontal
     * @param y
     *            the vertical
     * @param level
     *            the position of hero on the map
     */
	
	public Purse(int x, int y, IMap level) throws IOException {
		super(purse, Permeability.COLLECTIBLE, level, x, y);
		collected.loadImage();
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub

	}
	
    /**
     * when hero gets items like purse the item 
     *
     * @return points   
     */	
	public int collect() {
		if(this.isAlive()) {
			this.die();
			return points;
		}
		return 0;
	}
	/**
	 * the purse is destroyed when the hero walk on it
	 * 
	 */
	@Override
	public void die() {
		super.die();
		this.setSprite(collected);
		this.setHasMoved();
	}
}