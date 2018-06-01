package Element.motionless;

import java.awt.Image;

import model.Permeability;
import model.Sprite;

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
