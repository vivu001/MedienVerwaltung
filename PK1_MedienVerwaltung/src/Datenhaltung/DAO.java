/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datenhaltung;

import Fachlogik.Medium;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Vu Viet Duc
 */
public class DAO implements IDAO {

    final File sfile = new File("./Medienlist.ser");
    List<Medium> medienList;

    @Override
    public void speichern(List<Medium> liste) throws PersistenzException {
        try (FileOutputStream fos = new FileOutputStream(sfile);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {                     
            
            oos.writeObject(liste);
            oos.flush();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public List<Medium> laden() throws PersistenzException {
        
		try (FileInputStream fis = new FileInputStream(sfile);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            medienList = (List<Medium>) ois.readObject();

        } catch (FileNotFoundException e) {  
        	// TODO Auto-generated catch block
        } catch (IOException e) {
            System.out.println("IO-Fehler bei der Deserialisierung");
        } catch (ClassNotFoundException e) {
            System.out.println("Fehler: class-Datei nicht gefunden");
        }
        return medienList;
    }

}
