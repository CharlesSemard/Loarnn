package Element.mobile.auto;

import java.io.IOException;
import java.util.ArrayList;

import Element.mobile.Mobile;
import model.IMap;
import model.IMobile;
import model.Permeability;
import model.Sprite;


public class Spell extends Mobile{
	
	/** First sprite of the spell */
	private static Sprite first_sprite = new Sprite(' ', "fireball_1");
	
	/** Second sprite of the spell */
	private static Sprite second_sprite = new Sprite(' ', "fireball_2");
	
	/** Third sprite of the spell */
	private static Sprite third_sprite = new Sprite(' ', "fireball_3");
	
	/** Fourth sprite of the spell */
	private static Sprite fourth_sprite = new Sprite(' ', "fireball_4");
	
	/** Fifth sprite of the spell */
	private static Sprite fifth_sprite = new Sprite(' ', "fireball_5");
	
	/** Dead sprite of the spell */
	private static Sprite dead_sprite;
	
	/** List of all the sprites of the spell */
	private Sprite[] sprites;
	
	/** 
	 * The direction of the spell
	 * Possible values :
	 * <ul>
	 * <li>1 : Up</li>
	 * <li>2 : Down</li>
	 * <li>3 : Right</li>
	 * <li>4 : Left</li>
	 * </ul>
	 */
	private int direction;
	
	/** List of all the monsters */
	private ArrayList<IMobile> monsters;
	
	/**
	 * Instantiates a new spell
	 * @param level
	 * 		The level in which the spell stands
	 * @param x
	 * 		X coordinate
	 * @param y
	 * 		Y coordinate
	 * @param deadSprite
	 * 		Sprite of the element at position (x:0; y:0)
	 * @throws IOException
	 */
	public Spell(IMap level, int x, int y, Sprite deadSprite) throws IOException {
		super(deadSprite, Permeability.SPELL, level, x, y);
		Spell.dead_sprite = deadSprite;
		Spell.first_sprite.loadImage();
		Spell.second_sprite.loadImage();
		Spell.third_sprite.loadImage();
		Spell.fourth_sprite.loadImage();
		Spell.fifth_sprite.loadImage();
		
		this.sprites = new Sprite[5];
		
		this.sprites[0] = first_sprite;
		this.sprites[1] = second_sprite;
		this.sprites[2] = third_sprite;
		this.sprites[3] = fourth_sprite;
		this.sprites[4] = fifth_sprite;
		
		direction = 0;
		
		this.collect();
		
		monsters = new ArrayList<>();
	}
	
	@Override
	public void move() {
		if(this.isAlive()) {
			
			switch (direction) {
				case 1: // Up
					if(!moveUp()) {
						moveDown();
						direction = 2;
					}
					break;
				case 2: // Down
					if(!moveDown()) {
						moveUp();
						direction = 1;
					}
					break;
				case 3: // Right
					if(!moveRight()) {
						moveLeft();
						direction = 4;
					}
					break;
				case 4: // Left
					if(!moveLeft()) {
						moveRight();
						direction = 3;
					}
					break;
			}
			
			int index = 0;
			for(int i = 0; i < sprites.length; i++) {
				if(sprites[i] == this.getSprite()) {
					index = i;
				}
			}
			
			if(index < 4)
				this.setSprite(sprites[index + 1]);
			else
				this.setSprite(sprites[0]);
			
			for (IMobile monster : monsters) {
				if(monster.getPosition().getX() == this.getX() && monster.getPosition().getY() == this.getY())
				{
					monster.collect();
					this.collect();
					break;
				}
			}
			
		}
	}

	@Override
	public void doNothing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int collect() {
		this.die();
		return 0;
	}
	
	@Override
	public void die() {
		super.die();
		this.setSprite(dead_sprite);
		this.getPosition().x = 0;
		this.getPosition().y = 0;
	}
	
	/**
	 * Makes the spell spawn
	 * @param x
	 * 		X coordinate
	 * @param y
	 * 		Y coordinate
	 * @param direction
	 * 		Direction of the spell
	 */
	public void spawn(int x, int y, int direction) {
		if(this.setPosition(x, y))
		{
			this.direction = direction;
			this.setSprite(first_sprite);
			this.spawnSpell();		}
	}

	/**
	 * Adds a monster
	 * @param monster
	 * 		Monster to add
	 */
	public void addMonster(IMobile monster) {
		this.monsters.add(monster);
	}

}