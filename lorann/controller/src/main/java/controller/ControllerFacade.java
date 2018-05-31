package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     * Function that allows to test the BDD connection
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        this.getView().displayMessage(this.getModel().ShowLevelByID(2).toString());

        //this.getView().displayMessage(this.getModel().getExampleByName("Niveau 2").toString());

        final List<Example> examples = this.getModel().ShowAllLevels();
        final StringBuilder message = new StringBuilder();
       /* for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }*/
        this.getView().displayMessage(message.toString());
    }
    
    /**
     * Function that send the map for the first level in text format from the BDD
     *
     * @throws SQLException
     *             the SQL exception
     * @author Pierre-Loup MARTIGNE pierreloup.martigne@viacesi.fr
     */
    public String getLevel1() throws SQLException {
    	return this.getModel().ShowLevelByID(1).toString();
    }
    
    /**
     * Function that send the map for the Second level in text format from the BDD
     *
     * @throws SQLException
     *             the SQL exception
     *             
     * @author Pierre-Loup MARTIGNE pierreloup.martigne@viacesi.fr
     */
    public String getLevel2() throws SQLException {
    	return this.getModel().ShowLevelByID(2).toString();
    }
    
    /**
     * Function that send the map for the Third level in text format from the BDD
     *
     * @throws SQLException
     *             the SQL exception
     *             
     * @author Pierre-Loup MARTIGNE pierreloup.martigne@viacesi.fr
     */
    public String getLevel3() throws SQLException {
    	return this.getModel().ShowLevelByID(3).toString();
    }
    
    /**
     * Function that send the map for the Fourth level in text format from the BDD
     *
     * @throws SQLException
     *             the SQL exception
     *             
     * @author Pierre-Loup MARTIGNE pierreloup.martigne@viacesi.fr
     */
    public String getLevel4() throws SQLException {
    	return this.getModel().ShowLevelByID(4).toString();
    }
    
    /**
     * Function that send the map for the Fifth level in text format from the BDD
     *
     * @throws SQLException
     *             the SQL exception
     *             
     * @author Pierre-Loup MARTIGNE pierreloup.martigne@viacesi.fr
     */
    public String getLevel5() throws SQLException {
    	return this.getModel().ShowLevelByID(5).toString();
    }
    
    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
}
