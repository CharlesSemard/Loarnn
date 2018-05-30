package motionless;

import element.Permeability;
import element.Sprite;

class Gate extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('H',"gate_closed.png");

	Gate(){
		super(SPRITE, Permeability.BLOCKING);
	}
}