package es.iesfranciscodelosrios.model;

import es.iesfranciscodelosrios.utils.SQL;
import es.iesfranciscodelosrios.utils.Utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que usa a la clase SQL para la conexión a la base de datos.
 * @author Juan Miguel Rivas Velasco
 */
public abstract class DAOConnection {
    protected static Connection cn;
    protected static Boolean online;
    protected static final Logger Log = Utils.getLogger();
    protected static UsuarioDAO users;

    /**
     * Constructor de la clase
     */
    public DAOConnection(){
        if(cn == null){
            cn = SQL.getConnection("/es/iesfranciscodelosrios/others/h2.xml",
                    Utils.getFileAsLinesWithScanner("/es/iesfranciscodelosrios/others/h2.sql"));
            online = false;
        }
        if(cn == null){
            online = null;
            Log.log(Level.SEVERE,"Error Critico - no se cargo ninguna base de datos");
        }
    }

    /**
     * Metodo que cierra la conexion a la base de datos.
     * @return true si se cierra la conexion, false si no se puede cerrar.
     */
    public static Boolean close(){
       Boolean ret = false;
        try {
            if(cn != null){
                cn.close();
                cn = null;
                online = null;
                ret = true;
            }
        } catch (SQLException e) {
            Log.log(Level.SEVERE,Utils.exceptionInfo(e));
        }
        return ret;
    }

}
