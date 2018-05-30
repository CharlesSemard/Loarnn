package motionless;

import Element.Permeability;
import Element.Sprite;

class Gate extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('H',"gate_closed.png");

	Gate(){
		super(SPRITE, Permeability.BLOCKING);
	}
}