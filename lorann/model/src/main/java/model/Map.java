package model;

import java.awt.Point;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import Element.mobile.Purse;
import Element.mobile.auto.Monster_1;
import Element.mobile.auto.Monster_2;
import Element.mobile.auto.Monster_3;
import Element.mobile.auto.Monster_4;
import Element.motionless.MotionlessElementsFactory;
import model.dao.ExampleDAO;

public class Map extends Observable implements IMap {
	
	int Y = 0; 
	/** the width on the map */ 
	private final int width = 20;
	/** the height on the map */
	private final int height = 12;
	/** the table of the map */
	private IElement[][] onTheMap;
	/** position of the hero*/
	private Point characterPosition;
	/** position of the purses*/
	private ArrayList<IMobile> pursesPositions;
	/** position of the monsters*/
	private ArrayList<IMobile> monsters;
	/** position of the energyBall*/
	private Point energyBall;
	/** position of the door*/
	private Point door;
    /**
     * Instantiates a new Map.
     *
     * @param level
     *            the level
     */
	public Map (int level) {
		super();
		pursesPositions = new ArrayList<>();
		monsters = new ArrayList<>();
		
		try {
			this.loadLevel(level);
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * for the refresh 
	 */
	@Override
	public void setElementHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}
	
	 /**
     *
     * @param level
     *            the level number
	 * @throws IOException 
     * @throws SQLExceptions
     */
	private void loadLevel(int level) throws SQLException, IOException {
		String levelText = ExampleDAO.ShowLevelByID(level);
		this.onTheMap = new IElement[this.getWidth()][this.getHeight()];
		String[] levelArray = levelText.split("\n");
		for(int y = 0; y < 12; y++) {
			for(int x = 0; x < 20; x++) {
				switch(levelArray[y].toCharArray()[x]) {
					case 'P':
						this.setCharacterPosition(new Point(x, y));
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
						break;
					case 'i':
						this.pursesPositions.add(new Purse(x, y, this));
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
						break;
					case 'u':
						this.energyBall = new Point(x, y);
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
						break;
					case 'H':
						this.door = new Point(x, y);
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
						break;
					case 'w' :
						this.monsters.add(new Monster_1(this, x, y));
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
						break;
					case 'x' :
						this.monsters.add(new Monster_2(this, x, y));
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
						break;
					case 'y' :
						this.monsters.add(new Monster_3(this, x, y));
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
						break;
					case 'z' :
						this.monsters.add(new Monster_4(this, x, y));
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
						break;
					default: 
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.getSymbol(levelArray[y].toCharArray()[x]));
						break;
				}
			}
		}
	}
	/**
	 * Get the width 
	 */
	@Override
	public int getWidth() {
		return this.width;
	}
	/**
	 * Get the Height 
	 */
	
	@Override
	public int getHeight() {
		return this.height;
	}
	/**
	 * Get the map on the interface IElement  
	 */
	@Override
	public IElement getOnTheMapXY(int x, int y) {
		return onTheMap[x][y];
	}
	/**
	 * Set the map 
	 * @param x
	 * @param y
	 * @param element 
	 */
	@Override
	public void setOnTheMapXY(int x, int y, IElement element) {
		this.onTheMap[x][y] = element;
	}
	/**
	 * Watch over something or somebody
	 */
	@Override
	public Observable getObservable() {
		return this;
	}
	/**
	 * Set the spell on the map
	 * @param x
	 * @param y
	 * @param spell
	 */
	@Override
	public boolean setSpellOnTheMapXY(int x, int y, IElement spell) {
		if(this.getOnTheMapXY(x, y).getPermeability() == Permeability.SPELL) {
			this.onTheMap[x][y] = spell;
			return true;
		}
		else {
			return false;
		}
	}
	
	/* (non-javadoc)
	 * Pack de m�thodes utiles pour la m�thode loadLevel
	 */
	
	/**
	 * The methods : getCharacterPosition, setCharacterPosition, getPurses, getPurses, getEnergyBall, getDoor are usefull for the loadlevel methode 
	 */
	public Point getCharacterPosition() {
		return this.characterPosition;
	}

	/**
	 * Set the character position
	 * @param position
	 */
	private void setCharacterPosition(Point position) {
		this.characterPosition = position;
	}

	/**
	 * Get the list of every purse on the map
	 */
	public IMobile[] getPurses() {
		IMobile[] result = new IMobile[this.pursesPositions.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = (IMobile) pursesPositions.get(i);
		}
		return result;
	}

	/**
	 * Gets the list of every monsters on the map
	 */
	public IMobile[] getMonsters() {
		IMobile[] result = new IMobile[this.monsters.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = monsters.get(i);
		}
		return result;
	}

	/**
	 *  get the energyBall
	 */
	public Point getEnergyBall() {
		return energyBall;
	}

	public Point getDoor() {
		return door;
	}
}
