package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 * modified by Pierre-Loup MARTIGNE
 * @author Pierre-Loup MARTIGNE pierreloup.martigne@viacesi.fr
 * @version 2.0
 */
public abstract class ExampleDAO extends AbstractDAO {

    /** The sql example by id. */
    private static String ShowLevelByID   = "{call ShowLevelByID(?)}";

    /**
     * Gets the level by id.
     *
     * @param id
     *            the id
     * @return the map in text format by id
     * @throws SQLException
     *             the SQL exception
     */
    public static String ShowLevelByID(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(ShowLevelByID);
        String level = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                level = result.getString("Lev_Texte");
            }
            result.close();
        }
        return level;
    }
}