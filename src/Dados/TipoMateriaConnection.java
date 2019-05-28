/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class TipoMateriaConnection extends AgendaConnection{
   
    public static void saveMateria(String nome) throws SQLException{
        String sql = "insert into tipoMateria(nome) values (?)";
        try {
            PreparedStatement st = AgendaConnection.ConnectionAgendaDB().prepareStatement(sql);
            st.setString(1, nome);
            st.execute();
            AgendaConnection.ConnectionAgendaDB().close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoMateriaConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TipoMateriaConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TipoMateriaConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
}

