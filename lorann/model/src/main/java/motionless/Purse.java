package motionless;

import Element.Permeability;
import Element.Sprite;

public class Purse extends MotionlessElement {
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('i',"purse.png");
	
	/** Instantiates a new Purse. */
	Purse(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}