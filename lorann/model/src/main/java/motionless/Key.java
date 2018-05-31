package motionless;

import java.awt.Image;

import Element.Permeability;
import Element.Sprite;

class Key extends MotionlessElement {
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('u',"crystal_ball.png");
	
	/** Instantiates a new Key. */
	Key(){
		super(SPRITE, Permeability.BLOCKING);
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
}
