/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dgaraujo
 */
public class TarefaConnection extends AgendaConnection {
    
    public static void saveTarefa(String nome,Date datatarefa, String descricao,int id_cad_status,int id_tipomateria,int id_tipotarefa) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        String sql = "insert into tarefas(nome,datatarefa,descricao,id_cad_status,id_tipomateria,id_tipotarefa) values ?,?,?,?,?,?";
        
        try {
            PreparedStatement st = AgendaConnection.ConnectionAgendaDB().prepareStatement(sql);
            st.setString(1, nome);
            st.setDate(2, datatarefa);
            st.setString(3, descricao);
            st.setInt(4, id_cad_status);
            st.setInt(5,id_tipomateria);
            st.setInt(6, id_tipotarefa);

            AgendaConnection.ConnectionAgendaDB().close();
            
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(TarefaConnection.class.getName()).log(Level.SEVERE, null, ex);
        
        }catch (InstantiationException ex) {
            Logger.getLogger(TarefaConnection.class.getName()).log(Level.SEVERE, null, ex);
        
        }catch (IllegalAccessException ex) {
            Logger.getLogger(TarefaConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}