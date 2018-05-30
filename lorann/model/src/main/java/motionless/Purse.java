package motionless;

import element.Permeability;
import element.Sprite;

public class Purse extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('i',"purse.png");

	Purse(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}