package Element.motionless;

import model.Permeability;
import model.Sprite;

class Floor extends MotionlessElement {
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('.',"floor"); 
	/** Instantiates a new Floor. */
	Floor(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}