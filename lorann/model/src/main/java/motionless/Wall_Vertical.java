package motionless;

import Element.Permeability;
import Element.Sprite;

class Wall_Vertical extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite('1',"vertical_bone.png");

	Wall_Vertical(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
