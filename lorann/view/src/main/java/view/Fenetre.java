package view;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre extends JFrame{
    	
	public Fenetre() {
	
	JFrame Fenetre = new JFrame();
	int longueurFen = 1000;
	int largeurFen = 800;
	
	JPanel pan = new JPanel();
	JButton bouton = new JButton("Play");
	JButton bouton2 = new JButton("Exit");
	JLabel texte = new JLabel("Welcome to Lorann !\n\n What do you want to do ?\n\n");
	
	String url = "LorannLogo.jpg";
	ImageIcon icone = new ImageIcon(url);
	
	JLabel logo = new JLabel (icone, JLabel.CENTER);
	
	
	
    Fenetre.setTitle("Launcher Lorann");
    Fenetre.setResizable(false);
    Fenetre.setSize(longueurFen, largeurFen);
    Fenetre.setLocationRelativeTo(null);
    Fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    pan.add(texte);
    pan.add(bouton);
    pan.add(bouton2);
    pan.add(logo);
    Fenetre.validate();
    Fenetre.setVisible(true);
    Fenetre.setContentPane(pan);
    
    bouton2.addActionListener(e -> System.exit(0));
    bouton.addActionListener(e -> Fenetre.dispose()); 
    bouton.addActionListener(e -> new Fenetre2().setVisible(true));
    
    }
}
