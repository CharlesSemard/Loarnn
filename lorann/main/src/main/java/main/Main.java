package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.ControllerFacade;
import controller.IController;
import model.IModel;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Gwendal Lupart gwendal.lupart@viacesi.fr
 * @version 2.0
 */
public abstract class Main {
	
	/**The map of the level (text version) */
	//public static String mapLevel;
	
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
    	//Vraie fonction ‡ garder dans le main
    	Fenetre.Menu();
    	
<<<<<<< HEAD
    	
    	Thread.sleep(3000);
    	
    	
    	final IModel model = new ModelFacade(Fenetre.level);
    	final ViewFacade view = new ViewFacade(model.getLevel(), model.getHero(), model.getPurses(), model.getMonsters(), model.getEnergyBall(), model.getDoor());
        final ControllerFacade controller = new ControllerFacade(view, model);
=======
    	//Thread.sleep(8000);
    	
    	//Bloc de Fonctions de test du jeu ‡ placer dans les boutons des fenÍtres...
    	
    	final IModel model = new ModelFacade(2);
    	final ViewFacade view = new ViewFacade(model.getLevel(), model.getHero(), model.getPurses(), model.getMonsters(), model.getEnergyBall(), model.getDoor(), null);
        final IController controller = new ControllerFacade(view, model);
>>>>>>> Yolojeveuxr√©cup√©rerlecode
        view.setOrderPerformer(controller.getOrderPerformer());
        controller.start();        
        //Fin du Bloc de Fonctions de Test
        
        
    }   
}
