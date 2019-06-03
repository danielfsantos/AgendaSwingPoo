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
public class cadTarefasController {
    

    public boolean CampoIsNull(String campo1, String campo2, String campo3) {
        if (campo1 == "" & campo2 == "" && campo3 == "") {

            return true;
        } else {

            return false;
        }
    }

}
