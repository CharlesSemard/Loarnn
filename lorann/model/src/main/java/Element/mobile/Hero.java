package Element.mobile;

import java.io.IOException;
import java.util.ArrayList;

import Element.mobile.auto.Spell;
import model.IMap;
import model.IMobile;
import model.Permeability;
import model.Sprite;

public class Hero extends Mobile{
	
	/** The SPRITES. */
	private static Sprite lorann_b = new Sprite(' ', "lorann_b");
	private static Sprite lorann_bl = new Sprite(' ' ,"lorann_bl");
	private static Sprite lorann_br = new Sprite(' ' ,"lorann_br");
	private static Sprite lorann_u = new Sprite(' ' ,"lorann_u");
	private static Sprite lorann_ul = new Sprite(' ' ,"lorann_ul");
	private static Sprite lorann_ur = new Sprite(' ' ,"lorann_ur");
	private static Sprite lorann_l = new Sprite(' ' ,"lorann_l");
	private static Sprite lorann_r = new Sprite(' ' ,"lorann_r");
	
	
	private static Sprite[] sprites;
	
	private ArrayList<IMobile> purses;
	private ArrayList<IMobile> monsters;
	private IMobile key;
	private IMobile gate;
	/** The spell */
	private IMobile spell;
	
	private int score = 0;
	private boolean won = false;

	/** Is the gate open ? */
	Boolean hasKey = false;
	
    /**
     * Instantiates a new hero.
     * 
     * Generate the sprite of the hero
     *
     * @param x
     *            the horizontal
     * @param y
     *            the vertical
     * @param level
     *            the position of hero on the map
     */
	
	public Hero(int x, int y, IMap level) throws IOException {
		super(lorann_r, Permeability.BLOCKING, level);

		sprites = new Sprite[8];
		
		lorann_b.loadImage();
		lorann_bl.loadImage();
		lorann_br.loadImage();
		lorann_l.loadImage();
		lorann_u.loadImage();
		lorann_ul.loadImage();
		lorann_ur.loadImage();
		
		sprites[0] = lorann_l;
		sprites[1] = lorann_ul;
		sprites[2] = lorann_u;
		sprites[3] = lorann_ur;
		sprites[4] = lorann_r;
		sprites[5] = lorann_br;
		sprites[6] = lorann_b;
		sprites[7] = lorann_bl;
		
		this.initX(x);
		this.initY(y);
		
		this.purses = new ArrayList<>();
		this.monsters = new ArrayList<>();
	}
	
    /**
     * Do nothing.
     */	
	
	@Override
	public void doNothing() {
		
		if(isHit(this.getX(), this.getY())) {this.die();}
		else if(this.isOnSpell(this.getX(), this.getY())) 
			this.spell.collect();
		
		int index = 0;
		for(int i = 0; i < sprites.length; i++) {
			if(sprites[i] == this.getSprite()) {
				index = i;
			}
		}
		
		if(index < 7)
			this.setSprite(sprites[index + 1]);
		else
			this.setSprite(sprites[0]);
		this.setHasMoved();
	}
	
    /**
     * Define the movements for the special boxes like the monster or a purse.
     */	
	
	public void specialCase(int x, int y) {
		if(isHit(this.getX(), this.getY())) {this.die();}
		else if(this.isOnKey(x, this.getY())) {}
		else if(this.isOnDoor(x, this.getY())) {}
		else if(this.isOnPurse(x, this.getY())) {}
		else if(this.isOnSpell(x, this.getY())) {this.spell.collect();}
	}
	
    /**
     * Gets the moveLeft.
     *
     * @return true or false for moveLeft
     */	
	
	@Override
	public boolean moveLeft() {
		super.moveLeft();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_l);
		this.setHasMoved();
		return true;
	}
	
    /**
     * Gets the moveRight.
     *
     * @return true or false for moveRight
     */	
	
	@Override
	public boolean moveRight() {
		super.moveRight();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_r);
		this.setHasMoved();
		return true;
	}
	
    /**
     * Gets the moveUp.
     *
     * @return true or false for moveUp
     */	
	
	@Override
	public boolean moveUp() {
		super.moveUp();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_u);
		this.setHasMoved();
		return true;
	}
	
	/**
     * Gets the moveLeft.
     *
     * @return true or false for moveLeft
     */	
	
	@Override
	public boolean moveUpLeft() {
		super.moveUpLeft();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_ul);
		this.setHasMoved();
		return true;
	}
	
	/**
     * Gets the moveDown.
     *
     * @return true or false for moveRight
     */	
	
	@Override
	public boolean moveDown() {
		super.moveDown();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_br);
		this.setHasMoved();
		return true;
	}
	
    /**
     * Gets the moveRight.
     *
     * @return true or false for moveRight
     */	
	
	@Override
	public boolean moveDownRight() {
		super.moveDownRight();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_br);
		this.setHasMoved();
		return true;
	}
	
    /**
     * Gets the moveUp.
     *
     * @return true or false for moveUp
     */	
	
	@Override
	public boolean moveUpRight() {
		super.moveUpRight();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_ur);
		this.setHasMoved();
		return true;
	}
	
    /**
     * Gets the moveDown.
     *
     * @return true or false for moveDown
     */	
	
	@Override
	public boolean moveDownLeft() {
		super.moveDownLeft();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_bl);
		this.setHasMoved();
		return true;
	}
	
    /**
     * when the hero passes on a purse
     *
     * @return score  
     */	
	
	public boolean isOnPurse(int newX, int newY) {
		for(IMobile purse : purses) {
			if(purse.getX() == newX && purse.getY() == newY) {
				score += purse.collect();
				System.out.println("Score : " + score);
				return true;
			}
		}
		
		return false;
	}
	
    /**
     * when the hero passes on a key
     *
     * @return the open door  
     */	
	public boolean isOnKey(int newX, int newY) {
		if(key.getX() == newX && key.getY() == newY) {
			key.collect();
			hasKey = true;
			gate.collect();
			return true;
		}
		
		return false;
	}
	
    /**
     * when the hero passes on a door
     *
     * @return win or die  
     */	
	public boolean isOnDoor(int newX, int newY) {
		if(gate.getX() == newX && gate.getY() == newY) {
			if(hasKey) {
				this.won = true;
				this.die();
			}
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if the player is on the spell
	 * @param newX
	 * 		X coordinate
	 * @param newY
	 * 		Y coordinate
	 */
	public boolean isOnSpell(int newX, int newY) {
		if (spell != null)
		if(spell.getX() == newX && spell.getY() == newY)
			return true;
		return false;
	}
	
	@Override
	public boolean isHit(int newX, int newY) {
		for(IMobile monster : this.monsters) {
			if(monster.getX() == newX && monster.getY() == newY && monster.isAlive()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * add purse on the arrayList in Hero constructor
	 * @param purse
	 */
	
	public void addPurse(IMobile purse) {
		purses.add(purse);
	}
	
	/**
	 * add energyBall on the arrayList in Hero constructor
	 * @param energyBall
	 */
	
	public void addEnergyBall(IMobile energyBall) {
		this.key = energyBall;
	}
	
	/**
	 * add monster on the arrayList in Hero constructor
	 * @param monster
	 */
	public void addMonster(IMobile monster) {
		this.monsters.add(monster);
	}
	/**
	 * add door on the arrayList in Hero constructor
	 * @param door
	 */
	public void addDoor(IMobile door) {
		this.gate = door;
	}

	@Override
	public int collect() {
		return 0;
	}
	
	/**
	 * Makes the spell spawn at a specific location
	 */
	public void shoot() {
		if(spell != null)
		if(!spell.isAlive()) {
			int direction = lastY != 0 ? (lastY == -1 ? 2 : 1) : (lastX == -1 ? 3 : 4);
			((Spell)this.spell).spawn(this.getX() - lastX, this.getY() - lastY, direction);
		}
	}
	
	/**
	 * Adds the spell to the player
	 * @param spell
	 * 		Spell to add
	 */
	public void addSpell(IMobile spell) {
		this.spell = spell;
		for (IMobile monster : monsters) {
			((Spell)this.spell).addMonster(monster);
		}
	}
	
	/**
	 * @return the victory 
	 */

	public boolean hasWon() {
		return this.won;
	}
}
