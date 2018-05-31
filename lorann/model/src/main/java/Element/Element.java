package Element;

public abstract class Element {
	
	/** The sprite. */
	private Sprite sprite;
	
	/** The permeability. */
	private Permeability permeability;
	
    /**
     * Instantiates a new element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
	
	public Element(Sprite sprite, Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
	}
	public Permeability getPermeability() {
		return permeability;
	}
	
    /**
     * Sets the permeability.
     *
     * @param permeability
     *            the new permeability
     */
	
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	public Sprite getSprite() {
		return sprite;
	}
	
    /**
     * Sets the sprite.
     *
     * @param sprite
     *            the new sprite
     */
	
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
}
