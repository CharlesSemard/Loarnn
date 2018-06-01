package Element.motionless;

import java.awt.Image;

import model.Permeability;
import model.Sprite;

public class Purse extends MotionlessElement {
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('i',"purse.png");
	
	/** Instantiates a new Purse. */
	Purse(){
		super(SPRITE, Permeability.PENETRABLE);
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
}