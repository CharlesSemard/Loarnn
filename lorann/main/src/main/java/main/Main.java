package main;

import java.io.IOException;
import java.sql.SQLException;
import controller.ControllerFacade;
import model.ModelFacade;
import view.Fenetre;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Gwendal Lupart gwendal.lupart@viacesi.fr
 * @version 1.0
 */
public abstract class Main {
	
	/**The map of the level (text version) */
	public static String mapLevel;
	
    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException 
     */
    public static void main(final String[] args) throws IOException {
    	new Fenetre();
    	//model.Map.fillOnTheMap();
    	
    final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
        	mapLevel = controller.getLevel2();
            System.out.print(mapLevel);
        } catch (final SQLException exception) {
            exception.printStackTrace();
        	}
        }    
}
