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

    public static Connection ConnectionAgendaDB() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

        return con = DriverManager.getConnection(ConnectionString, "root", "");

    }
}
