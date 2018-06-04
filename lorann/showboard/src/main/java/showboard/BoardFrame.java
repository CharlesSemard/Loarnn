package showboard;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * <h1>The Class BoardFrame.</h1>
 * <p>
 * This class is just used to load the BoardPanel. It extends JPanel and implements IBoard.
 * </p>
 * <p>
 * As the BoardPanel is a private class, BoardPanel is a Facade.
 * </p>
 *
 * @author Anne-Emilie DIET
 * @version 3.0
 * @see JFrame
 * @see BoardPanel
 * @see Dimension
 * @see Rectangle
 * @see IBoard
 * @see ISquare
 * @see IPawn
 */
public class BoardFrame extends JFrame implements IBoard {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6563585351564617603L;

    /** The initial frame size. */
    private static final int  defaultFrameSize = 700;

    /** The board panel. */
    private final BoardPanel  boardPanel;

    /**
     * Instantiates a new board frame.
     *
     * @param title
     *            the title of the frame
     * @param decorated
     *            the decorated
     */
    public BoardFrame(final String title, final Boolean decorated) {
        super();
        this.setTitle(title);
        this.setSize(defaultFrameSize, defaultFrameSize);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(decorated);
        this.boardPanel = new BoardPanel();
        this.setContentPane(this.boardPanel);
        this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * Instantiates a new board frame.
     *
     * @param title
     *            the title
     */
    public BoardFrame(final String title) {
        this(title, false);
    }

    /**
     * Instantiates a new board frame.
     */
    public BoardFrame() {
        this("", false);
    }

    /**
     * Instantiates a new board frame.
     *
     * @param decorated
     *            the decorated
     */
    public BoardFrame(final Boolean decorated) {
        this("", decorated);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#addSquare(fr.exia.showboard.ISquare, int, int)
     */
    @Override
    public final void addSquare(final ISquare square, final int x, final int y) {
        this.getBoardPanel().addSquare(square, x, y);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#addPawn(fr.exia.showboard.IPawn)
     */
    @Override
    public final void addPawn(final IPawn pawn) {
        this.getBoardPanel().addPawn(pawn);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#getObserver()
     */
    @Override
    public final Observer getObserver() {
        return this.getBoardPanel();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#setDimension(java.awt.Dimension)
     */
    @Override
    public final void setDimension(final Dimension dimension) {
        this.getBoardPanel().setDimension(dimension);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#getDimension()
     */
    @Override
    public final Dimension getDimension() {
        return this.getBoardPanel().getDimension();
    }

    /**
     * Gets the display frame.
     *
     * @return the display frame
     */
    public final Rectangle getDisplayFrame() {
        return this.getBoardPanel().getDisplayFrame();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#setDisplayFrame(java.awt.Rectangle)
     */
    @Override
    public final void setDisplayFrame(final Rectangle displayFrame) {
        this.getBoardPanel().setDisplayFrame(displayFrame);
    }

    /**
     * Gets the board panel.
     *
     * @return the board panel
     */
    private BoardPanel getBoardPanel() {
        return this.boardPanel;
    }

    /**
     * Checks if is width looped.
     *
     * @return the boolean
     */
    public final Boolean isWidthLooped() {
        return this.getBoardPanel().isWidthLooped();
    }

    /**
     * Sets the width looped.
     *
     * @param widthLooped
     *            the new width looped
     */
    public final void setWidthLooped(final Boolean widthLooped) {
        this.getBoardPanel().setWidthLooped(widthLooped);
    }

    /**
     * Checks if is height looped.
     *
     * @return the boolean
     */
    public final Boolean isHeightLooped() {
        return this.getBoardPanel().isHeightLooped();
    }

    /**
     * Sets the height looped.
     *
     * @param heightLooped
     *            the new height looped
     */
    public final void setHeightLooped(final Boolean heightLooped) {
        this.getBoardPanel().setHeightLooped(heightLooped);
    }
    
    
    public static void Fenetre() {
    	
    	JFrame Fenetre = new JFrame();
    	int longueurFen = 1000;
    	int largeurFen = 800;
    	
    	JPanel pan1 = new JPanel();
    	JPanel pan2 = new JPanel();
    	JPanel panLevel1 = new JPanel();
    	JPanel panLevel2 = new JPanel();
    	JPanel panLevel3 = new JPanel();
    	JPanel panLevel4 = new JPanel();
    	JPanel panLevel5 = new JPanel();
    	
        pan2.setVisible(false);
        panLevel1.setVisible(false);
        panLevel2.setVisible(false);
        panLevel3.setVisible(false);
        panLevel4.setVisible(false);
        panLevel5.setVisible(false);
    	
    	JButton bouton = new JButton("Play");
    	JButton bouton2 = new JButton("Exit");
    	
    	JLabel texte = new JLabel("Welcome to Lorann !\n\n What do you want to do ?\n\n");
    	
    	String url = "LorannLogo.jpg";
    	ImageIcon icone = new ImageIcon(url);
    	
    	JLabel logo = new JLabel (icone, JLabel.CENTER);
    	
        Fenetre.setTitle("Lorann");
        Fenetre.setResizable(false);
        Fenetre.setSize(longueurFen, largeurFen);
        Fenetre.setLocationRelativeTo(null);
        Fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pan1.add(texte);
        pan1.add(bouton);
        pan1.add(bouton2);
        pan1.add(logo);
        Fenetre.validate();
        Fenetre.setVisible(true);
        Fenetre.setContentPane(pan1);
        
        JButton boutonExit = new JButton("Exit");
    	JButton boutonLevel1 = new JButton("Level 1");
    	JButton boutonLevel2 = new JButton("Level 2");
    	JButton boutonLevel3 = new JButton("Level 3");
    	JButton boutonLevel4 = new JButton("Level 4");
    	JButton boutonLevel5 = new JButton("Level 5");
    	
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
        
        bouton2.addActionListener(e -> System.exit(0));
        bouton.addActionListener(e -> pan1.setVisible(false));
        bouton.addActionListener(e -> pan2.setVisible(true));
        bouton.addActionListener(e -> Fenetre.setContentPane(pan2));

        //pan2.setVisible(true);
        

        
        
        panLevel1.add(texteLevel1);
        
        panLevel2.add(texteLevel2);
        
        panLevel3.add(texteLevel3);
        
        panLevel4.add(texteLevel4);
        
        panLevel5.add(texteLevel5);
        
      //  final IModel model = new ModelFacade(2);

       
        boutonExit.addActionListener(e -> System.exit(0));
        
        boutonLevel1.addActionListener(e -> pan2.setVisible(false));
        boutonLevel1.addActionListener(e -> panLevel1.setVisible(true));
        boutonLevel1.addActionListener(e -> Fenetre.setContentPane(panLevel1));
        
        boutonLevel2.addActionListener(e -> pan2.setVisible(false));
        boutonLevel2.addActionListener(e -> panLevel2.setVisible(true));
        boutonLevel2.addActionListener(e -> Fenetre.setContentPane(panLevel2));
       // boutonLevel2.addActionListener(e -> new ModelFacade(2));
        
        boutonLevel3.addActionListener(e -> pan2.setVisible(false));
        boutonLevel3.addActionListener(e -> panLevel3.setVisible(true));
        boutonLevel3.addActionListener(e -> Fenetre.setContentPane(panLevel3));
        
        boutonLevel4.addActionListener(e -> pan2.setVisible(false));
        boutonLevel4.addActionListener(e -> panLevel4.setVisible(true));
        boutonLevel4.addActionListener(e -> Fenetre.setContentPane(panLevel4));
        
        boutonLevel5.addActionListener(e -> pan2.setVisible(false));
        boutonLevel5.addActionListener(e -> panLevel5.setVisible(true));
        boutonLevel5.addActionListener(e -> Fenetre.setContentPane(panLevel5));
        
        
        
        }
    
    
}
