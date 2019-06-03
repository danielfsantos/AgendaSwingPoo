/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Dados.ListTarefaConnection;
import Templates.CadTarefas;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Daniel
 */
public class ListTarefaController extends ListTarefaConnection {
    
    public List<String> preenchertarefa() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        
        List<String> ListaTipoTarefa = new ArrayList();

        while(ListTarefaConnection.selectListTarefa().next()){
            ListaTipoTarefa.add(ListTarefaConnection.selectListTarefa().getString("tarefa"));
            
        }
        
        return ListaTipoTarefa;
    
                       
    }
    
}
