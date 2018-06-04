package model;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Pierre Loup Martigne
 * @version 1.0
 */
public interface IModel {
    
	/**
	 * Gets the level
	 * @return the level
	 */
	
    IMap getLevel();
    
	/**
	 * Gets the hero
	 * @return the hero
	 */
    
    IMobile getHero();
    
	/**
	 * Gets the purses
	 * @return the purses
	 */
    
	IMobile[] getPurses();
	
	/**
	 * Gets the monster
	 * @return the monster
	 */
	
	IMobile[] getMonsters();
	
	/**
	 * Gets the energyBall
	 * @return the energyBall
	 */

	IMobile getEnergyBall();
	
	/**
	 * Gets the door
	 * @return the door
	 */
	
	IMobile getDoor();
	
	/**
	 * Gets the win of hero
	 * @return true or false for the win of hero
	 */

	boolean hasCharacterWon();

	IMobile getSpell();
}