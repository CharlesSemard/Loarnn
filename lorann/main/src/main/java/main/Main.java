package main;



import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JPanel;

import controller.ControllerFacade;
import model.ModelFacade;
import view.Fenetre;
import view.ViewFacade;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Gwendal Lupart gwendal.lupart@viacesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException 
     */
    public static void main(final String[] args) throws IOException {
    	//new Fenetre();
    	//model.Map.fillOnTheMap();
    	
      final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.startLevel5();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
        

          }  
}
