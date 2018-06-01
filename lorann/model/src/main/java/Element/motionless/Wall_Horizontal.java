package Element.motionless;

import java.awt.Image;
<<<<<<< Updated upstream:lorann/model/src/main/java/Element/motionless/Wall_Horizontal.java

import model.Permeability;
import model.Sprite;
=======
import Element.Permeability;
import Element.Sprite;
>>>>>>> Stashed changes:lorann/model/src/main/java/motionless/Wall_Horizontal.java

class Wall_Horizontal extends MotionlessElement {
	
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('-',"horizontal_bone.png");

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