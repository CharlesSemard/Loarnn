package view;

import javax.swing.JPanel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import showboard.BoardFrame;


public class Fenetre2 extends JFrame {

	public Fenetre2() {
		
	JFrame Fenetre2 = new JFrame();
    
	int longueurFen = 1100;
	int largeurFen = 800;
	
	JPanel pan2 = new JPanel();
	JPanel panLevel1 = new JPanel();
	JPanel panLevel2 = new JPanel();
	JPanel panLevel3 = new JPanel();
	JPanel panLevel4 = new JPanel();
	JPanel panLevel5 = new JPanel();
	
	JButton boutonExit = new JButton("Exit");
	JButton boutonLevel1 = new JButton("Level 1");
	JButton boutonLevel2 = new JButton("Level 2");
	JButton boutonLevel3 = new JButton("Level 3");
	JButton boutonLevel4 = new JButton("Level 4");
	JButton boutonLevel5 = new JButton("Level 5");
	
	JLabel texte = new JLabel("--- Select your level : ---");
	JLabel texteLevel1 = new JLabel("Level 1");
	JLabel texteLevel2 = new JLabel("Level 2");
	JLabel texteLevel3 = new JLabel("Level 3");
	JLabel texteLevel4 = new JLabel("Level 4");
	JLabel texteLevel5 = new JLabel("Level 5");
	
	String url = "LorannLogo.jpg";
	ImageIcon icone = new ImageIcon(url);
	
	JLabel logo = new JLabel (icone, JLabel.CENTER);
	
    /*Fenetre2.setTitle("Lorann");
    Fenetre2.setSize(longueurFen, largeurFen);
    Fenetre2.setLocationRelativeTo(null);
    Fenetre2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Fenetre2.validate();
    Fenetre2.setVisible(true);
    Fenetre2.setResizable(false);
    Fenetre2.setContentPane(pan2);*/
    
    pan2.add(texte);
    pan2.add(boutonLevel1);
    pan2.add(boutonLevel2);
    pan2.add(boutonLevel3);
    pan2.add(boutonLevel4);
    pan2.add(boutonLevel5);
    pan2.add(boutonExit);
    pan2.add(logo);
    pan2.setVisible(true);
    
    
    panLevel1.setVisible(false);
    panLevel2.setVisible(false);
    panLevel3.setVisible(false);
    panLevel4.setVisible(false);
    panLevel5.setVisible(false);
    
    
    panLevel1.add(texteLevel1);
    
    panLevel2.add(texteLevel2);
    
    panLevel3.add(texteLevel3);
    
    panLevel4.add(texteLevel4);
    
    panLevel5.add(texteLevel5);

   
    boutonExit.addActionListener(e -> System.exit(0));
    boutonLevel1.addActionListener(e -> pan2.setVisible(false));
    boutonLevel1.addActionListener(e -> panLevel1.setVisible(true));
    boutonLevel1.addActionListener(e -> Fenetre2.setContentPane(panLevel1));
    
    boutonLevel2.addActionListener(e -> pan2.setVisible(false));
    boutonLevel2.addActionListener(e -> panLevel2.setVisible(true));
    boutonLevel2.addActionListener(e -> Fenetre2.setContentPane(panLevel2));
    
    boutonLevel3.addActionListener(e -> pan2.setVisible(false));
    boutonLevel3.addActionListener(e -> panLevel3.setVisible(true));
    boutonLevel3.addActionListener(e -> Fenetre2.setContentPane(panLevel3));
    
    boutonLevel4.addActionListener(e -> pan2.setVisible(false));
    boutonLevel4.addActionListener(e -> panLevel4.setVisible(true));
    boutonLevel4.addActionListener(e -> Fenetre2.setContentPane(panLevel4));
    
    boutonLevel5.addActionListener(e -> pan2.setVisible(false));
    boutonLevel5.addActionListener(e -> panLevel5.setVisible(true));
    boutonLevel5.addActionListener(e -> Fenetre2.setContentPane(panLevel5));
	}
    }

