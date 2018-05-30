package view;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre2 extends JFrame {

	public Fenetre2() {
		
	JFrame Fenetre2 = new JFrame();
    Fenetre2.setResizable(false);
	int longueurFen = 1100;
	int largeurFen = 800;
	JPanel pan = new JPanel();
	JButton boutonExit = new JButton("Exit");
	JLabel texte = new JLabel("--- Select your level : ---");
	
	String url = "LorannLogo.jpg";
	ImageIcon icone = new ImageIcon(url);
	
	JLabel logo = new JLabel (icone, JLabel.CENTER);
	
	
	
    Fenetre2.setTitle("Lorann");
    Fenetre2.setSize(longueurFen, largeurFen);
    Fenetre2.setLocationRelativeTo(null);
    Fenetre2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    pan.add(texte);
    pan.add(boutonExit);

    pan.add(logo);
    Fenetre2.validate();
    Fenetre2.setVisible(true);
    Fenetre2.setContentPane(pan);

    //bouton.addActionListener(e -> System.exit(0));
    boutonExit.addActionListener(e -> System.exit(0));
	}
    }

