package Element;

import java.awt.Image;
import model.IElement;
import model.Permeability;
import model.Sprite;

public abstract class Element implements IElement {
	
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
	
	/**
     * Gets the permeability.
     *
     * @return the permeability
     */
	public Permeability getPermeability() {
		return this.permeability;
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
	
	@Override
	public Sprite getSprite() {
		return this.sprite;
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
	
	/**
     * Gets the image.
     *
     * @return the image
     */
	
	@Override
	public Image getImage() {
		return this.getSprite().getImage();
	}
}
