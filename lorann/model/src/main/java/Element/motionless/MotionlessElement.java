package Element.motionless;

import Element.Element;
import model.Permeability;
import model.Sprite;

abstract class MotionlessElement extends Element{
	/** Instantiates a new MotionlessElement. */
	MotionlessElement (Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
	}
}
