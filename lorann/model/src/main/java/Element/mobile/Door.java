package Element.mobile;

import java.io.IOException;

import model.IMap;
import model.Permeability;
import model.Sprite;

public class Door extends Mobile {

	private static Sprite opened = new Sprite('H', "gate_open");
	private static Sprite closed = new Sprite('H', "gate_closed");
	
	public Door(int x, int y, IMap level) throws IOException {
		super(closed, Permeability.COLLECTIBLE, level, x, y);
		opened.loadImage();
	}

	@Override
	public void doNothing() {
	}
	
	public int collect() {
		if(this.isAlive()) {
			this.die();
		}
		return 0;
	}
	
	@Override
	public void die() {
		super.die();
		this.setSprite(opened);
		this.setHasMoved();
	}

}