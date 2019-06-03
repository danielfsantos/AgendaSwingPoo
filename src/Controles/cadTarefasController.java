/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;
import Dados.TarefaConnection;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class cadTarefasController extends TarefaConnection implements Interfaces.InterfaceCadTarefas {
    public void getSaveTarefa(String nome,String datatarefa,String descricao,String id_cad_status,String id_tipomateria,String id_tipotarefa) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (!checkCamposTarefa(nome,datatarefa,descricao,id_cad_status,id_tipomateria,id_tipotarefa)) {
             TarefaConnection.saveTarefa(nome,datatarefa,descricao,id_cad_status,id_tipomateria,id_tipotarefa);
            JOptionPane.showConfirmDialog(null, "Tarefas Salvo com sucesso", "Atenção !", JOptionPane.DEFAULT_OPTION);
        }else {
            JOptionPane.showConfirmDialog(null, "Ocorreu um erro", "Atenção !", JOptionPane.DEFAULT_OPTION);
        }
        
    }

    @Override
    public boolean checkCamposTarefa(String nome, String datatarefa, String descricao, String id_cad_status, String id_tipomateria, String id_tipotarefa) {
        
         if (nome.equals("") && datatarefa.equals("") && descricao.equals("") && id_cad_status.equals("") && id_tipomateria.equals("") && id_tipotarefa.equals("")) {
            JOptionPane.showConfirmDialog(null, "Campo Vazio Por favor preencha");
            return true;
        } else {
            return false;
        }
        
        
    }

    
 }


