package Element.mobile;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IMap;
import model.ModelFacade;

public class HeroTest {
	Hero hero;
	IMap map;
	ModelFacade model;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.model = new ModelFacade(1);
		this.hero = new Hero(15, 7, model.getLevel());
		this.hero.addEnergyBall(this.model.getEnergyBall());
		this.hero.addDoor(this.model.getDoor());
	}

	@Test
	public void testMoveUp() {
		this.hero.moveUp();
		assertEquals(6, this.hero.getY());
	}

	@Test
	public void testMoveLeft() {
		this.hero.moveLeft();
		assertEquals(14, this.hero.getX());
	}
	
	@Test
	public void testMoveDown() {
		this.hero.moveDown();
		assertEquals(8, this.hero.getY());
	}

	@Test
	public void testMoveRight() {
		this.hero.moveRight();
		assertEquals(16, this.hero.getX());
	}

	/*@Test
	public void testMoveUpRight() {
		this.hero.moveUpRight();
		assertEquals(6, 8);	
		}*/

	/*@Test
	public void testMoveDownLeft() {
		this.hero.moveDownLeft();
		assertEquals(6, 8);
	}*/

	/*@Test
	public void testMoveUpLeft() {
		this.hero.moveUpLeft();
		assertEquals(6, 6);
	}*/

	/*@Test
	public void testMoveDownRight() {
		this.hero.moveDownRight();
		assertEquals(8, this.hero.getY());
		assertEquals(8, this.hero.getX());
	}*/

	/*@Test
	public void testIsHit() {
		fail("Not yet implemented");
	}

	@Test
	public void testShoot() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoNothing() {
		fail("Not yet implemented");
	}

	@Test
	public void testSpecialCase() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsOnPurse() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsOnKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsOnDoor() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsOnSpell() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddPurse() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddEnergyBall() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMonster() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddDoor() {
		fail("Not yet implemented");
	}

	@Test
	public void testCollect() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasWon() {
		fail("Not yet implemented");
	}*/

}
