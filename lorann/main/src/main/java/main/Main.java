package main;



import java.awt.Color;
import java.io.IOException;
import javax.swing.JPanel;

import view.Fenetre;

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
    	new Fenetre();
    	
      /*  final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start(); 
            
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }*/
        
    	/*JFrame Fenetre = new JFrame();

    	JPanel pan = new JPanel();
    	JButton bouton = new JButton("Play");
    	JButton bouton2 = new JButton("Exit");
    	JLabel texte = new JLabel("Welcome to Lorann !\n\n What do you want to do ?\n\n");
    	
    	String url = "LorannLogo.jpg";
    	ImageIcon icone = new ImageIcon(url);
    	
    	JLabel logo = new JLabel (icone, JLabel.CENTER);
    	
    	
    	
        Fenetre.setTitle("Lorann");
        Fenetre.setSize(1000, 800);
        Fenetre.setLocationRelativeTo(null);
        Fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pan.add(texte);
        pan.add(bouton);
        pan.add(bouton2);
        pan.add(logo);
        Fenetre.validate();
        Fenetre.setVisible(true);
        Fenetre.setContentPane(pan);
        Fenetre.setVisible(true);
        
        bouton2.addActionListener(e -> System.exit(0));*/


                        

          }  
}
