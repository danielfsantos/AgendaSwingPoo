
package Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgendaConnection {
    
    private static String ConnectionString = "jdbc:mysql://localhost:3306/db_agenda?useUnicode=yes&characterEncoding=UTF-8&useTimezone=true&serverTimezone=UTC";
    private static Connection con = null;
    private static Statement stmt = null;
    private static String user = "root";
    
    public static void ConnectionAgendaDB(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(ConnectionString,"root","");
            
            
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
