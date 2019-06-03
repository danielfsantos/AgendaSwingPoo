/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

/**
 *
 * @author Daniel
 */
<<<<<<< HEAD
public class cadTarefasController {
    
=======
>>>>>>> danielguimaraes

import Dados.TarefaConnection;
import java.sql.Date;
import java.sql.SQLException;

public class cadTarefasController extends TarefaConnection {
    
    public static void getSaveTarefa(String nome,Date datatarefa,String descricao,int id_cad_status,int id_tipomateria,int id_tipotarefa) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        TarefaConnection.saveTarefa(nome,datatarefa,descricao,id_cad_status,id_tipomateria,id_tipotarefa);
        
    }
 }


