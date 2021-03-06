package Element.motionless;

import model.Permeability;
import model.Sprite;

class Gate extends MotionlessElement {
	
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('H',"gate_open");
	

	/** Instantiates a new Gate. */
	Gate(){
		super(SPRITE, Permeability.DOOR);
	}
}