package Element.motionless;

import java.awt.Image;

import model.Permeability;
import model.Sprite;


class Wall_Horizontal extends MotionlessElement {
	
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('-',"horizontal_bone");

	/** Instantiates a new Wall_Horizontal. */
	Wall_Horizontal(){
		super(SPRITE, Permeability.BLOCKING);
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
}