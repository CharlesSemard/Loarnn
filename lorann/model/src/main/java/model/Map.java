package model;

import java.awt.Point;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

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
	private ArrayList<Point> pursesPositions;
	/** position of the monsters*/
	private ArrayList<Point> monstersPositions;
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
		monstersPositions = new ArrayList<>();
		
		try {
			this.loadLevel(level);
		} catch (SQLException e) {
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
     * Load the mobile Elements on the map 
     * NOT FINISHED YET...
     *
     * @param level
     *            the level number
     * @throws SQLExceptions
     */
	private void loadLevel(int level) throws SQLException {
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
						this.pursesPositions.add(new Point(x, y));
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
						break;
					case 'u':
						this.energyBall = new Point(x, y);
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
					case 'H':
						this.door = new Point(x, y);
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
					case 'x' :
						Point temp = new Point(x, y);
						this.monstersPositions.add(temp);
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.creatFloor());
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
	 * Pack de méthodes utiles pour la méthode loadLevel
	 */
	
	/**
	 * The methods : getCharacterPosition, setCharacterPosition, getPurses, getPurses, getEnergyBall, getDoor are usefull for the loadlevel methode 
	 */
	public Point getCharacterPosition() {
		return this.characterPosition;
	}

	private void setCharacterPosition(Point position) {
		this.characterPosition = position;
	}

	public Point[] getPurses() {
		Point[] result = new Point[this.pursesPositions.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = pursesPositions.get(i);
		}
		return result;
	}

	public Point[] getMonsters() {
		Point[] result = new Point[this.monstersPositions.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = monstersPositions.get(i);
		}
		return result;
	}

	public Point getEnergyBall() {
		return energyBall;
	}

	public Point getDoor() {
		return door;
	}
}
