/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Dados.TipoMateriaConnection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class cadTipoMateriaController extends TipoMateriaConnection implements Interfaces.InterfaceDado {

    public void getSaveTipoMateria(String nome) throws SQLException {
        if (!checkCampos(nome)) {
            TipoMateriaConnection.saveMateria(nome);
            JOptionPane.showConfirmDialog(null, "Materia Salva com sucesso", "Atenção !", JOptionPane.DEFAULT_OPTION);
        }else {
            JOptionPane.showConfirmDialog(null, "Ocorreu um erro", "Atenção !", JOptionPane.DEFAULT_OPTION);
        }
    }

    @Override
    public boolean checkCampos(String campo) {
        if (campo.equals("")) {
            JOptionPane.showConfirmDialog(null, "Campo Vazio Por favor preencha");
            return true;
        } else {
            return false;
        }
    }
}
