package motionless;

import Element.Permeability;
import Element.Sprite;

class Floor extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite(' ',"floor.png"); // /!\ Warning : ne pas oublier de créer le sprite "floor.png" (il s'agit d'un simple fond noir) /!\

	Floor(){
		super(SPRITE, Permeability.BLOCKING);
	}
}