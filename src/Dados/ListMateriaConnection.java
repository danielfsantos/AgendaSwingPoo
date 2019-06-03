/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dgaraujo
 */
public class ListMateriaConnection extends AgendaConnection {
    
     public  List<String> selectListMateria() throws IllegalAccessException, InstantiationException, SQLException, ClassNotFoundException {
        String query = "select id,materia from tipoMateria";
        PreparedStatement ps = AgendaConnection.ConnectionAgendaDB().prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<String> lista = new ArrayList<>();
        while(rs.next()){
            lista.add(rs.getString("materia"));
        }
        return lista;
    }
    
}
