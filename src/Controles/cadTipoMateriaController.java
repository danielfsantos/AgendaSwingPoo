/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Dados.TipoMateriaConnection;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class cadTipoMateriaController extends TipoMateriaConnection{
    
    public void getSaveTipoMateria() throws SQLException{
        TipoMateriaConnection.saveMateria();
    }
}