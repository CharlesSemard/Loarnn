package Element.mobile;

import model.IMap;
import model.Permeability;
import model.Sprite;


public class Spell extends Mobile{
	/** The Constant SPRITE. */
	private static Sprite fireball_1;
	/** Instantiates a new Spell. */
	public Spell(IMap level, int x, int y) {
		super(fireball_1, Permeability.SPELL, level, x, y);
	}

	@Override
	public void doNothing() {
	}

	@Override
	public int collect() {
		return 0;
	}
}