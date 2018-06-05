package Element.mobile.auto;

import java.util.Random;

import model.IMap;
import model.Sprite;

public class Monster_4 extends Monster {
	
	/**
	 *  Sprite for the monster
	 */
	private static Sprite sprite = new Sprite('z', "monster_4");

	/**
	 *  Instantiate a monster
	 * @param level
	 * @param x
	 * @param y
	 */
	public Monster_4(IMap level, int x, int y) {
		super(sprite, level, x, y);
	}

	/**
	 * 
	 */
	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
	}
	
	/** AI Random Diagonal */
	@Override
	public void move() {

		Random random = new Random();
		
		boolean hasMoved = false;
		
		while(!hasMoved) {
			switch(random.nextInt(5)) {
				case 0:
					hasMoved = moveUpRight();
					break;
				case 1:
					hasMoved = moveDownLeft();
					break;
				case 2:
					hasMoved = moveUpLeft();
					break;
				case 3:
					hasMoved = moveDownRight();
					break;
				case 4:
					hasMoved = true;
					doNothing();
					break;
			}
		}	
	}

	
	@Override
	public int collect() {
		// TODO Auto-generated method stub
		return 0;
	}
}