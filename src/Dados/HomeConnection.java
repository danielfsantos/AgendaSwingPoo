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
        String query = "select a.nome , a.datatarefa, a.descricao, b.Materia ,c.Tarefa,d.Status  from tarefas AS a \n" +
                        "join tipomateria as b on a.id_tipoMateria = b.id\n" +
                        "join tipotarefa as c on a.id_tipoTarefa = c.id\n" +
                        "join cadstatus as d on a.id_cadstatus = d.id";
        PreparedStatement ps = AgendaConnection.ConnectionAgendaDB().prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

}
