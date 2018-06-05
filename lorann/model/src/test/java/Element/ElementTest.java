package Element;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Element.Element;
import Element.motionless.MotionlessElementsFactory;
import model.Permeability;
import model.Sprite; 

public class ElementTest {
	Element Floor;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Floor = MotionlessElementsFactory.creatFloor();
	}

	@Test
	public void testGetPermeability() {
		this.Floor.getPermeability();
		Permeability exepcted = this.Floor.getPermeability();
		Permeability Test = Permeability.PENETRABLE;
		assertEquals(exepcted, Test);

	}

	@Test
	public void testSetPermeability() {
		Permeability permeability = Permeability.BLOCKING;
		Floor.setPermeability(permeability);
		Permeability Test = Floor.getPermeability();
		assertEquals(permeability, Test);
	}

	@Test
	public void testGetSprite() {
		this.Floor.getSprite();
		Sprite exepcted = this.Floor.getSprite();
		Sprite Test = new Sprite('.',"floor");
		assertEquals(exepcted, Test);
	}

	@Test
	public void testSetSprite() {
		Sprite sprite = new Sprite('O',"bone");
		Floor.setSprite(sprite);
		Sprite Test = Floor.getSprite();
		assertEquals(sprite, Test);
	}

}
