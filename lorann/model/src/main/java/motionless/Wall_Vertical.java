package motionless;

import java.awt.Image;

import model.Permeability;
import model.Sprite;

class Wall_Vertical extends MotionlessElement {
	
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('1',"vertical_bone.png");

	/** Instantiates a new Wall_Vertical. */
	Wall_Vertical(){
		super(SPRITE, Permeability.BLOCKING);
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
}
