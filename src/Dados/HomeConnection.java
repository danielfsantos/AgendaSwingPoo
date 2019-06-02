/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class HomeConnection extends AgendaConnection {

    public static ResultSet selectHome() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        String query = "select * from tarefas";
        PreparedStatement ps = AgendaConnection.ConnectionAgendaDB().prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

}
