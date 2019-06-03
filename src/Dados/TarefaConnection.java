/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dgaraujo
 */
public class TarefaConnection extends AgendaConnection {

    public static void saveTarefa(String nome, String datatarefa, String descricao, String id_cad_status, String id_tipomateria, String id_tipotarefa) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        String sql = "insert into tarefas(nome,datatarefa,descricao,id_cadStatus,id_tipoMateria,id_tipoTarefa) values ?,?,?,?,?,?";

        try {
            PreparedStatement st = AgendaConnection.ConnectionAgendaDB().prepareStatement(sql);
            st.setString(1, nome);
            st.setString(2, datatarefa);
            st.setString(3, descricao);
            st.setInt(4, getIdCadStatus(id_cad_status));
            st.setInt(5, getIdTipoMateria(id_tipomateria));
            st.setInt(6, getIdTipoTarefa(id_tipotarefa));
            st.execute();
            AgendaConnection.ConnectionAgendaDB().close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TarefaConnection.class.getName()).log(Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            Logger.getLogger(TarefaConnection.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            Logger.getLogger(TarefaConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getIdTipoMateria(String nome) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        String query = "select id from tipoMateria where Materia = ?";
        PreparedStatement ps = AgendaConnection.ConnectionAgendaDB().prepareStatement(query);
        ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        int idTipoMateria = 0;
        while (rs.next()) {
            idTipoMateria = rs.getInt("id");         
        }
        return idTipoMateria;
    }

    public static int getIdCadStatus(String nome) throws IllegalAccessException, InstantiationException, SQLException, ClassNotFoundException {
        String query = "select id from cadStatus  where Status = ?";
        PreparedStatement ps = AgendaConnection.ConnectionAgendaDB().prepareStatement(query);
          ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        int idCadStatus = 0;
        while (rs.next()) {
            idCadStatus = rs.getInt("id");
            System.out.print(idCadStatus);
        }
        return idCadStatus;
    }
    public static int getIdTipoTarefa(String nome) throws IllegalAccessException, InstantiationException, SQLException, ClassNotFoundException{
     String query = "select id from tipoTarefa where tarefa = ?";
    PreparedStatement ps = AgendaConnection.ConnectionAgendaDB().prepareStatement(query);
    ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        int idTipoTarefa = 0;
        while(rs.next()){
            idTipoTarefa = rs.getInt("id");
        }
        return idTipoTarefa;
    }
}
