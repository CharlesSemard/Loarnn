package motionless;

import Element.Permeability;
import Element.Sprite;

public class Purse extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('i',"purse.png");

	Purse(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}