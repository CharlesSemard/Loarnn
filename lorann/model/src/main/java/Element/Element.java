package Element;

public abstract class Element {
	private String sprite;
	private Permeability permeability;
	public Element(Sprite sprite, Permeability permeability) {
	}
	public Permeability getPermeability() {
		return permeability;
	}
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
}
