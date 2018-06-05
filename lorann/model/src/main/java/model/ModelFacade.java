package model;

import java.io.IOException;
import java.sql.SQLException;

import Element.mobile.Door;
import Element.mobile.Hero;
import Element.mobile.Key;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {
	
	private IMap level;
	private Hero Hero;
	private IMobile[] purses;
	private IMobile[] monsters;
	private IMobile key;
	private IMobile door;
	/** The spell */
	private IMobile spell;

    /**
     * Instantiates a new model facade.
     * @param level
     * 				the level on the map 
     */
    public ModelFacade(int level) throws SQLException, IOException {
        super();
        this.setLevel(new Map(level));
        this.setCharacter(new Hero((int)this.level.getCharacterPosition().getX(), (int)this.level.getCharacterPosition().getY(), this.level));

        purses = new IMobile[this.getLevel().getPurses().length];
        monsters = new IMobile[this.getLevel().getMonsters().length];
        
        for(int i = 0; i < purses.length; i++) {
        	purses[i] = this.getLevel().getPurses()[i];
        	((Hero)this.getHero()).addPurse(purses[i]);
        }
        
        for(int i = 0; i < monsters.length; i++) {
        	monsters[i] = this.getLevel().getMonsters()[i];
	        ((Element.mobile.Hero) this.getHero()).addMonster(monsters[i]);
        }
        
        key = new Key((int)this.getLevel().getEnergyBall().getX(), (int)this.getLevel().getEnergyBall().getY(), this.level);
        ((Hero)this.getHero()).addEnergyBall(key);
        
        door = new Door((int)this.getLevel().getDoor().getX(), (int)this.getLevel().getDoor().getY(), this.level);
        ((Hero)this.getHero()).addDoor(door);
    }
    
    /**
     * Get the level on IMap interface
     * @return level
     */
    @Override
	public IMap getLevel() {
		return this.level;
	}
	/**
	 * Set the level 
	 * @param level
	 */
	private void setLevel(IMap level) {
		this.level = level;
	}
	/**
	 * Set the hero 
	 * @param character
	 */
	private void setCharacter(Hero character) {
		this.Hero = character;
	}
	/**
	 * Get the purses on IMobile interface 
	 * @return purses
	 */
	public IMobile[] getPurses() {
		return purses;
	}
	/**
	 * Set the purse on this level 
	 * @param purses
	 */
	public void setPurses(IMobile[] purses) {
		this.purses = purses;
	}
	/**
	 * Get the monsters on the IMobile interface
	 * @return monsters
	 */
	public IMobile[] getMonsters() {
		return monsters;
	}
	/**
	 * Set the monsters on the IMobile interface
	 * @param monsters
	 */
	public void setMonsters(IMobile[] monsters) {
		this.monsters = monsters;
	}
	/**
	 * Get the energyball on the IMobile interface
	 * @return energyBall
	 */
	public IMobile getEnergyBall() {
		return this.key;
	}
	/**
	 * Get the door on the IMobile interface
	 * @return door
	 */
	public IMobile getDoor() {
		return this.door;
	}
	/**
	 * if the hero has won 
	 * @return hero win 
	 */
	@Override
	public boolean hasCharacterWon() {
		return ((Hero)this.getHero()).hasWon();
	}
	/**
	 * Get hero on the interface IMobile 
	 * @return Hero
	 */
	@Override
	public IMobile getHero() {
		return this.Hero;
	}
	
	/**
	 * Gets the spell
	 */
	@Override
	public IMobile getSpell() {
		return this.spell;
	}
}
