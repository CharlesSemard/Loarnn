package Element.motionless;

import model.Permeability;
import model.Sprite;

class Wall_Vertical extends MotionlessElement {
	
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('1',"vertical_bone");

	/** Instantiates a new Wall_Vertical. */
	Wall_Vertical(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
