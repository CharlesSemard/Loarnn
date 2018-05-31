package mobile;

public class Hero extends Mobile{
	
	/** The Hero X position */
	int /**/ position_Y;
	/** The Hero Y position */
	int position_X;
	/** Is the hero alive ? */
	Boolean isAlive = true;
	/** The Hero Moving Speed */
	int speed = 1;
	/** Is the Hero allowed to launch a spell ? */
	Boolean hasSpell = true;
	/** Is the gate open ? */
	Boolean hasKey = false;
	
}
