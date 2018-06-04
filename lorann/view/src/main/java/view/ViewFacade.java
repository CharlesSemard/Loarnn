package view;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import model.IElement;
import model.IMap;
import model.IMobile;
import showboard.BoardFrame;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView, KeyListener, Runnable {
	
	/** The Level. */
	private IMap level;
	
	/** The character. */
	private IMobile Hero;
	
	/** The order performer. */
	private IOrderPerformer orderPerformer;
	
	/** The Constant squareSize. */
    private static final int squareSize = 32;

    /** The Constant fullView. */
    private Rectangle fullView;
    
    private IMobile[] purses;
    
    /** The monsters. */
    private IMobile[] monsters;
    
    private IMobile key;
    
    private IMobile door;

	/**
     * Instantiates a new view facade.
	 * @throws IOException 
     */
    public ViewFacade(IMap level, IMobile Hero, IMobile[] purses, IMobile[] monsters, IMobile energyBall, IMobile door) throws IOException {
        this.setLevel(level);
        this.setHero(Hero);
        ((IElement) this.getHero()).getSprite().loadImage();
        this.setFullView(new Rectangle(0, 0, this.getLevel().getWidth(), this.getLevel().getHeight()));
        SwingUtilities.invokeLater(this);
        
        this.purses = purses;
        this.key = energyBall;
        this.door = door;
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    /**
     * Set the Level.
	 * @throws IOException 
     */
	public void setLevel(IMap level) throws IOException {
		this.level = level;
		int y = 0;
		int x = 0;
		for (y = 0; y < this.getLevel().getHeight(); y++) {
			for (x = 0; x < this.getLevel().getWidth(); x++) {
				this.getLevel().getOnTheMapXY(x,y).getSprite().loadImage();
			}
		}
	}
    
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
	@Override
	public void run() {
		BoardFrame boardFrame = new BoardFrame("Loraaaan Jenkins", false);
		boardFrame.setDimension(new Dimension(this.getLevel().getWidth(), this.getLevel().getHeight()));
        boardFrame.setDisplayFrame(this.fullView);
        boardFrame.setSize(this.fullView.width * squareSize - 32, this.fullView.height * squareSize);
        boardFrame.setHeightLooped(false);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
		
		for (int x = 0; x < this.getLevel().getWidth(); x++) {
            for (int y = 0; y < this.getLevel().getHeight(); y++) {
                boardFrame.addSquare(this.level.getOnTheMapXY(x, y), x, y);
            }
        }
		
		for(IMobile purse : purses) {
			try {
				((IElement) purse).getSprite().loadImage();
			} catch (IOException e) {
				e.printStackTrace();
			}
			boardFrame.addPawn(purse);
		}
		
		try {
			((IElement) this.key).getSprite().loadImage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(IMobile monster : monsters) {
			try {
				((IElement) monster).getSprite().loadImage();
			} catch (IOException e) {
				e.printStackTrace();
			}
			boardFrame.addPawn(monster);
		}
		
		try {
			((IElement) this.door).getSprite().loadImage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boardFrame.addPawn(this.key);
		
		boardFrame.addPawn(this.door);
        
		boardFrame.addPawn(this.getHero());


        this.getLevel().getObservable().addObserver(boardFrame.getObserver());

        boardFrame.setVisible(true);
	}
	
	/**
     * Get the Level.
     */
	public IMap getLevel() {
		return this.level;
	}

	public IMobile getHero() {
		return this.Hero;
	}

	public void setHero(IMobile hero) {
		this.Hero = hero;
	}
	
	/*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
	@Override
	public void keyTyped(KeyEvent keyEvent) {
		//NOP
	}

	/*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		this.getOrderPerformer().performOrder(keyEvent);
	}

	/*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
	@Override
	public void keyReleased(KeyEvent keyEvent) {
		//NOP
	}
	
	/**
     * Get the OrderPerformer.
     */
	public IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

	/**
     * Set the OrderPerformer.
     */
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	/**
     * Get the full view.
     */
	public Rectangle getFullView() {
		return this.fullView;
	}

	/**
     * Set the full view.
     */
	public void setFullView(Rectangle fullView) {
		this.fullView = fullView;
	}
}
