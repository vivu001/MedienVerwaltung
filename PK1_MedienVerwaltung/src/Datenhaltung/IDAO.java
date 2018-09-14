/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datenhaltung;

import Fachlogik.Medium;
import java.util.List;

/**
 *
 * @author Vu Viet Duc
 */
public interface IDAO {
    void speichern(List<Medium> liste) throws PersistenzException;
    List<Medium> laden() throws PersistenzException;

    public static class PersistenzException extends Exception {
        public PersistenzException() {
        }
    }
}
