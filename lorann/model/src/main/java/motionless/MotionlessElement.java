package motionless;

import element.Element;
import element.Permeability;
import element.Sprite;

abstract class MotionlessElement extends Element{
	MotionlessElement (Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
	}
}
