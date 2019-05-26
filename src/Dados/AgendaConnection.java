
package Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgendaConnection {
    
    private static String ConnectionString = "jdbc:derby://localhost:1527/AgendaDB;user=root";
    private static Connection con = null;
    private static Statement stmt = null;
    
    
    public static void ConnectionAgendaDB(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.driver").newInstance();
            con = DriverManager.getConnection(ConnectionString);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AgendaConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AgendaConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AgendaConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
}
