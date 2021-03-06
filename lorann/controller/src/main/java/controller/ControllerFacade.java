package controller;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;

import model.IMobile;
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController, IOrderPerformer {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    /** The order. */
    private KeyEvent stackOrder;
    
    /** The speed of refresh. */
    private static int speed = 100;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     * @throws InterruptedException 
     */
    public void start() throws SQLException, InterruptedException, IOException {
        while(this.getModel().getHero().isAlive()) {
        	Thread.sleep(speed);
        	if (this.getModel().getSpell() != null)
        	if(this.getModel().getSpell().isAlive())
        		this.getModel().getSpell().move();
        	
        	for(IMobile monster : this.getModel().getMonsters()) {
        		if(monster.isAlive())
        			monster.move();
        	}
        	
        	if(this.getStackOrder() != null) {
        		switch(this.getStackOrder().getKeyCode()) {
        		case KeyEvent.VK_NUMPAD6:
        			this.getModel().getHero().moveRight();
        			break;
        		case KeyEvent.VK_NUMPAD4:
        			this.getModel().getHero().moveLeft();
        			break;
        		case KeyEvent.VK_NUMPAD8:
        			this.getModel().getHero().moveUp();
        			break;
        		case KeyEvent.VK_NUMPAD2:
        			this.getModel().getHero().moveDown();
        			break;
        		case KeyEvent.VK_RIGHT:
        			this.getModel().getHero().moveRight();
        			break;
        		case KeyEvent.VK_LEFT:
        			this.getModel().getHero().moveLeft();
        			break;
        		case KeyEvent.VK_UP:
        			this.getModel().getHero().moveUp();
        			break;
        		case KeyEvent.VK_DOWN:
        			this.getModel().getHero().moveDown();
        			break;
        		case KeyEvent.VK_NUMPAD7:
        			this.getModel().getHero().moveUpLeft();
        			break;
        		case KeyEvent.VK_NUMPAD9:
        			this.getModel().getHero().moveUpRight();
        			break;
        		case KeyEvent.VK_NUMPAD3:
        			this.getModel().getHero().moveDownRight();
        			break;
        		case KeyEvent.VK_NUMPAD1:
        			this.getModel().getHero().moveDownLeft();
        			break;
        		case KeyEvent.VK_SPACE:
        			this.getModel().getHero().shoot();
        			break;
        		default:
        			this.getModel().getHero().doNothing();
        			break;
        		}
        		this.stackOrder = null;
        	}
        	else {
        		this.getModel().getHero().doNothing();
        	}
        	
        }
        if(this.getModel().hasCharacterWon()) {
        	this.getView().displayMessage("You escaped !");
        	System.exit(1); }
        else {
        	this.getView().displayMessage("You're dead..");
        	System.exit(1);
        }
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
    
    /**
     * Stock the order.
     *
     * @return the model
     */
    public void performOrder(KeyEvent userOrder) {
    	this.setStackOrder(userOrder);
    }

    /**
     * Gets the order.
     *
     * @return the model
     */
	public KeyEvent getStackOrder() {
		return stackOrder;
	}

	/**
     * Set the order.
     *
     * @return the model
     */
	public void setStackOrder(KeyEvent stackOrder) {
		this.stackOrder = stackOrder;
	}
	
	/**
     * Gets the Order performer.
     *
     * @return the model
     */
	public IOrderPerformer getOrderPerformer() {
		return this;
	}
}
