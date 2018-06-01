package Element.motionless;

import java.awt.*;

import model.Permeability;
import model.Sprite;

class GateOpen extends MotionlessElement {
	
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('H',"gate_open.png");
	

	/** Instantiates a new Gate. */
	GateOpen(){
		super(SPRITE, Permeability.BLOCKING);
	}


	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}