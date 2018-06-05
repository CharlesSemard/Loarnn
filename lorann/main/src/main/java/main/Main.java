package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.ControllerFacade;
import controller.IController;
import model.IModel;
import model.ModelFacade;
import view.ViewFacade;

/** THIS IS OUR LAST VERSION OF OUR LORANN PROJECT 
 * @author Alexandre Vivier Baudry
 * @author Gwendal Lupart
 * @author Jonathan Seguin
 * @author Charles Semard
 * @author Pierre-Loup Martigne
 * @version final
 * */

/**
 * <h1>The Class Main.</h1>
 *
 * @author Gwendal Lupart gwendal.lupart@viacesi.fr
 * @version 2.0
 */
public abstract class Main {
	
    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException 
     * @throws SQLException 
     * @throws InterruptedException 
     */
    public static void main(final String[] args) throws IOException, SQLException, InterruptedException {
    	Fenetre.Menu();
    	
    	Thread.sleep(5000);
    	
    	final IModel model = new ModelFacade(Fenetre.level);
    	final ViewFacade view = new ViewFacade(model.getLevel(), model.getHero(), model.getPurses(), model.getMonsters(), model.getEnergyBall(), model.getDoor(), model.getSpell());
        final IController controller = new ControllerFacade(view, model);
        view.setOrderPerformer(controller.getOrderPerformer());
        controller.start();   
    }   
}
