package Element.mobile;

import java.io.IOException;

import model.IMap;
import model.Permeability;
import model.Sprite;

public class Door extends Mobile {

	/** The SPRITE. */
	private static Sprite opened = new Sprite('H', "gate_open");
	private static Sprite closed = new Sprite('H', "gate_closed");
	
	public Door(int x, int y, IMap level) throws IOException {
		super(closed, Permeability.COLLECTIBLE, level, x, y);
		opened.loadImage();
	}
	
    /**
     * Do nothing.
     *
     * @return the default 
     */	
	
	@Override
	public void doNothing() {
	}
	
    /**
     * Gets items like door
     *
     * @return score  
     */		
	
	public int collect() {
		if(this.isAlive()) {
			this.die();
		}
		return 0;
	}
	
    /**
     * Causes the door to die and replaces it
     *
     * @return the open door  
     */	
	
	@Override
	public void die() {
		super.die();
		this.setSprite(opened);
		this.setHasMoved();
	}

}