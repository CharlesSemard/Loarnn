package Element.mobile.auto;

import java.util.Random;

import model.IMap;
import model.Sprite;

public class Monster_3 extends Monster {
	
	private static Sprite sprite = new Sprite('y', "monster_3");

	public Monster_3(IMap level, int x, int y) {
		super(sprite, level, x, y);
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
	}
	
	/** AI Random */
	@Override
	public void move() {

		Random random = new Random();
		
		boolean hasMoved = false;
		
		while(!hasMoved) {
			switch(random.nextInt(5)) {
			case 0:
				hasMoved = moveUp();
				break;
			case 1:
				hasMoved = moveDown();
				break;
			case 2:
				hasMoved = moveLeft();
				break;
			case 3:
				hasMoved = moveRight();
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
