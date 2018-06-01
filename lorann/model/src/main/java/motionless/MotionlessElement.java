package motionless;

import Element.Element;
import model.Permeability;
import model.Sprite;

abstract class MotionlessElement extends Element{
	MotionlessElement (Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
	}
}
