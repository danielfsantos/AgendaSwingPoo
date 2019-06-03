
package Controles;

import Dados.TipoMateriaConnection;
import Dados.TipoStatusConnection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PauloPC
 */
public class cadStatusController extends TipoStatusConnection implements Interfaces.InterfaceDado {
public void getSaveTipoStatus(String nome) throws SQLException {
        if (!checkCampos(nome)) {
            TipoStatusConnection.saveTipoStatus(nome);
            JOptionPane.showConfirmDialog(null, "Status Salvo com sucesso", "Atenção !", JOptionPane.DEFAULT_OPTION);
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
