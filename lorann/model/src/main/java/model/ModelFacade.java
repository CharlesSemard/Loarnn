package model;

import java.io.IOException;
import java.sql.SQLException;

import Element.mobile.Door;
import Element.mobile.Hero;
import Element.mobile.Key;
import Element.mobile.Purse;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {
	
	private IMap level;
	private IMobile Hero;
	private IMobile[] purses;
	private IMobile[] monsters;
	private IMobile energyBall;
	private IMobile door;
	/** The spell */
	private IMobile spell;

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade(int level) throws SQLException, IOException {
        super();
        this.setLevel(new Map(level));
        this.setCharacter(new Hero((int)this.level.getCharacterPosition().getX(), (int)this.level.getCharacterPosition().getY(), this.level));

        purses = new IMobile[this.getLevel().getPurses().length];
        monsters = new IMobile[this.getLevel().getMonsters().length];
        
        for(int i = 0; i < purses.length; i++) {
        	purses[i] = new Purse((int)this.getLevel().getPurses()[i].getX(), (int)this.getLevel().getPurses()[i].getY(), this.level);
        	((Hero)this.getHero()).addPurse(purses[i]);
        }
        
        for(int i = 0; i < monsters.length; i++) {
        	
        }
        
        energyBall = new Key((int)this.getLevel().getEnergyBall().getX(), (int)this.getLevel().getEnergyBall().getY(), this.level);
        ((Hero)this.getHero()).addEnergyBall(energyBall);
        
        door = new Door((int)this.getLevel().getDoor().getX(), (int)this.getLevel().getDoor().getY(), this.level);
        ((Hero)this.getHero()).addDoor(door);
    }
    
    @Override
	public IMap getLevel() {
		return this.level;
	}
	
	private void setLevel(IMap level) {
		this.level = level;
	}

	private void setCharacter(IMobile character) {
		this.Hero = character;
	}

	public IMobile[] getPurses() {
		return purses;
	}

	public void setPurses(IMobile[] purses) {
		this.purses = purses;
	}

	public IMobile[] getMonsters() {
		return monsters;
	}

	public void setMonsters(IMobile[] monsters) {
		this.monsters = monsters;
	}

	public IMobile getEnergyBall() {
		return this.energyBall;
	}
	
	public IMobile getDoor() {
		return this.door;
	}

	@Override
	public boolean hasCharacterWon() {
		return ((Hero)this.getHero()).hasWon();
	}

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
