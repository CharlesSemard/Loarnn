package model;

import java.awt.Point;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import Element.motionless.MotionlessElementsFactory;
import model.dao.ExampleDAO;

public class Map extends Observable implements IMap {
	
	int Y = 0; //il sert à quoi cte merde ? model.model.Map
	
	private final int width = 20;
	
	private final int height = 12;
	
	private IElement[][] onTheMap;
	
	private Point characterPosition;
	
	private ArrayList<Point> pursesPositions;
	
	private ArrayList<Point> monstersPositions;
	
	private Point energyBall;
	
	private Point door;
	
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
	
	/* model.model.Map
	 * Fonction de Gwendall pour tester à partir d'un fichier txt, plus utile mtn je crois (PL)
	 * Tu peux confirmer Gwendall stp ? Avant que je supprime et que ça casse tout !
	 * 
	 * (non-javadoc)
	 */
	/*public void fillOnTheMap() throws FileNotFoundException {
	
		try {
			Scanner scanner = new Scanner(controller.ControllerFacade.getLevel1);
			char Dimension[][] = new char [this.getHeight()][this.getWidth()];
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				for (int Y=0; Y<this.getHeight();Y++) {
				for (int X=0; X<this.getWidth(); X++) {
					Dimension[Y][X] = line.charAt(X);
				}
				Y++;
				}
			}
			scanner.close();
		}catch(Exception e) {
			e.getMessage().toString();
		}
	}*/
	
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
					case 'x':
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
					default: 
						this.setOnTheMapXY(x, y, MotionlessElementsFactory.getSymbol(levelArray[y].toCharArray()[x]));
						break;
				}
			}
		}
	}
	
	@Override
	public int getWidth() {
		return this.width;
	}
	
	@Override
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public IElement getOnTheMapXY(int x, int y) {
		return onTheMap[x][y];
	}
	
	@Override
	public void setOnTheMapXY(int x, int y, IElement element) {
		this.onTheMap[x][y] = element;
	}

	@Override
	public Observable getObservable() {
		return null;
	}
	
	@Override
	public boolean setSpellOnTheMapXY(int x, int y, IElement spell) {
		if(this.getOnTheMapXY(x, y).getPermeability() == Permeability.PENETRABLE) {
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
