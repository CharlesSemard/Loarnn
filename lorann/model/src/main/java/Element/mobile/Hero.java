package Element.mobile;

import java.io.IOException;
import java.util.ArrayList;

import model.IMap;
import model.IMobile;
import model.Permeability;
import model.Sprite;

public class Hero extends Mobile{
	
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
	
	private int score = 0;
	private boolean won = false;

	/** Is the Hero allowed to launch a spell ? */
	Boolean hasSpell = true;
	/** Is the gate open ? */
	Boolean hasKey = false;
	
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
	
	@Override
	public void doNothing() {
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
	
	public void specialCase(int x, int y) {
		if(this.isOnKey(x, this.getY())) {}
		else if(this.isOnDoor(x, this.getY())) {}
		else if(this.isHit(x, this.getY())) {}
		else if(this.isOnPurse(x, this.getY())) {}
	}
	
	@Override
	public boolean moveLeft() {
		super.moveLeft();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_l);
		this.setHasMoved();
		return true;
	}
	
	@Override
	public boolean moveRight() {
		super.moveRight();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_r);
		this.setHasMoved();
		return true;
	}
	
	@Override
	public boolean moveUp() {
		super.moveUp();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_u);
		this.setHasMoved();
		return true;
	}
	
	@Override
	public boolean moveDown() {
		super.moveDown();
		specialCase(this.getX(), this.getY());
		this.setSprite(lorann_b);
		this.setHasMoved();
		return true;
	}
	
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
	
	public boolean isOnKey(int newX, int newY) {
		if(key.getX() == newX && key.getY() == newY) {
			key.collect();
			hasKey = true;
			gate.collect();
			System.out.println("Key found");
			return true;
		}
		
		return false;
	}
	
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
	
	public void addPurse(IMobile purse) {
		purses.add(purse);
	}
	
	public void addEnergyBall(IMobile energyBall) {
		this.key = energyBall;
	}
	
	public void addMonster(IMobile monster) {
		this.monsters.add(monster);
	}
	
	public void addDoor(IMobile door) {
		this.gate = door;
	}

	@Override
	public int collect() {
		return 0;
	}

	public boolean hasWon() {
		return this.won;
	}
}
