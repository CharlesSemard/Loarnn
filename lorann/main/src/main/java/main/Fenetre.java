package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ModelFacade;


public class Fenetre extends JFrame {
	
				/** Functions initialization */
	
			static int level = 0;
	    	static JFrame Fenetre = new JFrame();
	    	static int longueurFen = 1000;
	    	static int largeurFen = 800;

	    		/** Panels initialization*/
	    	
	    	static JPanel pan1 = new JPanel();
	    	static JPanel pan2 = new JPanel();
	    	static JPanel panLevel1 = new JPanel();
	    	static JPanel panLevel2 = new JPanel();
	    	static JPanel panLevel3 = new JPanel();
	    	static JPanel panLevel4 = new JPanel();
	    	static JPanel panLevel5 = new JPanel();
	    	
	        	/** Buttons initialization*/
	    	
	    	static JButton bouton = new JButton("Play");
	    	static JButton bouton2 = new JButton("Exit");
	    	
	    	static JLabel texte = new JLabel("Welcome to Lorann !\n\n What do you want to do ?\n\n");
	    	
	    	static String url = "LorannLogo.jpg";
	    	static ImageIcon icone = new ImageIcon(url);
	    	
	    	static JLabel logo = new JLabel (icone, JLabel.CENTER);
	    	
	    	static JButton boutonExit = new JButton("Exit");
	    	static JButton boutonLevel1 = new JButton("Level 1");
	    	static JButton boutonLevel2 = new JButton("Level 2");
	    	static JButton boutonLevel3 = new JButton("Level 3");
	    	static JButton boutonLevel4 = new JButton("Level 4");
	    	static JButton boutonLevel5 = new JButton("Level 5");
	    	


	 public static void Menu() {
		 
		 		/** Frame initialization*/
		 
		 	Fenetre.setTitle("Lorann");
	        Fenetre.setResizable(false);
	        Fenetre.setSize(longueurFen, largeurFen);
	        Fenetre.setLocationRelativeTo(null);
	        Fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        	/**Adding new components*/
	        
	        pan1.add(texte);
	        pan1.add(bouton);
	        pan1.add(bouton2);
	        pan1.add(logo);
	        Fenetre.validate();
	        Fenetre.setVisible(true);
	        Fenetre.setContentPane(pan1);
		 	pan2.setVisible(false);
		 	panLevel1.setVisible(false);
		 	panLevel2.setVisible(false);
		 	panLevel3.setVisible(false);
		 	panLevel4.setVisible(false);
		 	panLevel5.setVisible(false);

	        
	      
	    	
	    	JLabel texte2 = new JLabel("--- Select your level : ---");
	    	JLabel texteLevel1 = new JLabel("Level 1");
	    	JLabel texteLevel2 = new JLabel("Level 2");
	    	JLabel texteLevel3 = new JLabel("Level 3");
	    	JLabel texteLevel4 = new JLabel("Level 4");
	    	JLabel texteLevel5 = new JLabel("Level 5");
	    	
	    	String url2 = "LorannLogo.jpg";
	    	ImageIcon icone2 = new ImageIcon(url2);
	    	
	    	JLabel logo2 = new JLabel (icone2, JLabel.CENTER);
	    	
	        pan2.add(texte2);
	        pan2.add(boutonLevel1);
	        pan2.add(boutonLevel2);
	        pan2.add(boutonLevel3);
	        pan2.add(boutonLevel4);
	        pan2.add(boutonLevel5);
	        pan2.add(boutonExit);
	        pan2.add(logo2);
	        
	        	/** ActionListeners of the first panel */
	        
	        bouton2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
	        
	        
	        bouton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					pan1.setVisible(false);
					pan2.setVisible(true);
					Fenetre.setContentPane(pan2);
				}
			});
	        

	        
	        panLevel1.add(texteLevel1);
	        
	        panLevel2.add(texteLevel2);
	        
	        panLevel3.add(texteLevel3);
	        
	        panLevel4.add(texteLevel4);
	        
	        panLevel5.add(texteLevel5);
	       
	        	/** Buttons ActionListeners */
	        
	        boutonExit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
	        
	        
	        
	        boutonLevel1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					pan2.setVisible(false);
					panLevel1.setVisible(true);
					Fenetre.setContentPane(panLevel1);
					level = 1;
					System.out.println(level);
					Fenetre.dispose();				
				}
			});
	        
	       
	        
	        boutonLevel2.addActionListener(new ActionListener() {
	        	
	        	@Override
				public void actionPerformed(ActionEvent e) {
	        		pan2.setVisible(false);
	        		panLevel2.setVisible(true);
	        		Fenetre.setContentPane(panLevel2);
	        		level = 2;
	        		System.out.println(level);
	        		Fenetre.dispose();
	        	}
	        });
	        
 
	        
	        
	        boutonLevel3.addActionListener(new ActionListener() {
	        	
	        	@Override
				public void actionPerformed(ActionEvent e) {
	        		pan2.setVisible(false);
	        		panLevel3.setVisible(true);
	        		Fenetre.setContentPane(panLevel3);
	        		level = 3;
	        		System.out.println(level);
	        		Fenetre.dispose();
	        	}
	        });
	        

	        
	        boutonLevel4.addActionListener(new ActionListener() {
	        	
	        	@Override
				public void actionPerformed(ActionEvent e) {
	        		pan2.setVisible(false);
	        		panLevel4.setVisible(true);
	        		Fenetre.setContentPane(panLevel4);
	        		level = 4;
	        		System.out.println(level);
	        		Fenetre.dispose();
	        	}
	        });
	        

	        
	        boutonLevel5.addActionListener(new ActionListener() {
	        	
	        	@Override
				public void actionPerformed(ActionEvent e) {
	        		pan2.setVisible(false);
	        		panLevel5.setVisible(true);
	        		Fenetre.setContentPane(panLevel5);
	        		level = 5;
	        		System.out.println(level);
	        		Fenetre.dispose();
	        	}
	        });
      
	        }

} 

