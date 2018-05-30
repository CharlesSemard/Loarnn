package motionless;

import Element.Permeability;
import Element.Sprite;

class Floor extends MotionlessElement {
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(' ',"floor.png"); // /!\ Warning : ne pas oublier de cr�er le sprite "floor.png" (il s'agit d'un simple fond noir) /!\
	/** Instantiates a new Floor. */
	Floor(){
		super(SPRITE, Permeability.BLOCKING);
	}
}