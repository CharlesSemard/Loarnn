package model;

public enum Permeability {
	/** For the Walls (basic, vertical and horizontal) */
	BLOCKING,
	/** For the Floor */
	PENETRABLE,
	/** For the Purse and the key */
	COLLECTIBLE,
	/** For the Door */
	DOOR, 
	/** For the spell */
	SPELL, 
	/** For the monsters */
	MONSTER;
}
