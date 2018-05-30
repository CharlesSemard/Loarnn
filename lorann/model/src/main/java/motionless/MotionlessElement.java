package motionless;

import Element.Element;
import Element.Permeability;
import Element.Sprite;

abstract class MotionlessElement extends Element{
	MotionlessElement (Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
	}
}
