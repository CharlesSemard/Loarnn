package view;

import java.awt.Dimension;

import javax.swing.JOptionPane;
import showboard.BoardFrame;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
    	super();
    	final BoardFrame BFA = new BoardFrame("Title");
    	Dimension Dim = new Dimension(20,12);
    	BFA.setDimension(Dim);
        for (int PosY = 0; PosY < 12; PosY++) {
        	for (int PosX = 0; PosX < 20; PosX++) {
            	BFA.addSquare(Element, PosX, PosY);
            }
        }
        BFA.setVisible(true);
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
