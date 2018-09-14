package Prk_02;

import java.io.Serializable;

import javax.swing.*;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Medienverwaltung implements Serializable {

    private static final long serialVersionUID = 1L;
    final File sfile = new File("./Medienlist.ser");

    ArrayList<Medium> medienArrayList = new ArrayList<Medium>();

    public void aufnehmen(Medium medium) {
        medienArrayList.add(medium);
    }

    public Iterator<Medium> iterator() {
        return medienArrayList.iterator();
    }

    public void zeigeMedien() {
        Collections.sort(medienArrayList);
//		Collections.sort(medienArrayList, new JahrComparator());

//        if (it.hasNext()) {
//            for (Medium s : medienArrayList) {
//                s.druckeDaten(System.out);
//            }
//        }
        Iterator<Medium> it = iterator();
        while (it.hasNext()) {
            it.next().druckeDaten(System.out);
        }
    }

    //try-with-resources
    public void zeigeMedienFile() throws HeadlessException, FileNotFoundException, EmptyFilenameException {
        boolean isError = false;

        while (!isError) {
            try {
                String dateiname = JOptionPane.showInputDialog("Dateiname");
                if (dateiname.isEmpty()) {
                    throw new EmptyFilenameException("Bitte g�ltiger Dateiname");
                }

                try (FileOutputStream out = new FileOutputStream(dateiname)) {
                    Collections.sort(medienArrayList);
                        for (Medium s : medienArrayList) {
                            s.druckeDaten(out);
                        }
                    
                    isError = true;
                }
            } catch (EmptyFilenameException ie) {
                int dialogButton = JOptionPane.showConfirmDialog(null, "Dateinamen ist leer! Neuen Dateinamen w�hlen?", "Hinweis", JOptionPane.YES_NO_OPTION);
                if (dialogButton == JOptionPane.NO_OPTION) {
                    isError = true;
                }
            } catch (NullPointerException npe) {
                isError = true;
            } catch (IOException IOEx) {
                IOEx.printStackTrace();
            } catch (Exception e) {
                // Output unexpected Exceptions
                System.out.println("keine Ahnung");
                e.printStackTrace();
            }
        }
    }

    // finally-Block
    public void zeigeMedienFile_2() throws HeadlessException, EmptyFilenameException {
        boolean isError = false;

        while (!isError) {
            FileOutputStream out = null;

            try {
                String dateiname = JOptionPane.showInputDialog("Dateiname");
                if (dateiname.isEmpty()) {
                    throw new EmptyFilenameException("Bitte g�ltiger Dateiname");
                }

                out = new FileOutputStream(dateiname);

                Collections.sort(medienArrayList);

                for (Medium s : medienArrayList) {
                    s.druckeDaten(out);
                }

                isError = true;

            } catch (NullPointerException npe) {
                isError = true;
            } catch (EmptyFilenameException ie) {
                int dialogButton = JOptionPane.showConfirmDialog(null, "Dateinamen ist leer! Neuen Dateinamen w�hlen?", "Hinweis", JOptionPane.YES_NO_OPTION);
                if (dialogButton == JOptionPane.NO_OPTION) {
                    isError = true;
                }
            } catch (Exception e) {
                // Output unexpected Exceptions
                System.out.println("keine Ahnung");
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.flush();
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Speichern
    public void speichern() {

        try (FileOutputStream fos = new FileOutputStream(sfile);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(medienArrayList);
            oos.flush();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Laden
    public void laden() {
        try (FileInputStream fis = new FileInputStream(sfile);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            medienArrayList = (ArrayList<Medium>) ois.readObject();           

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO-Fehler bei der Deserialisierung");
        } catch (ClassNotFoundException e) {
            System.out.println("Fehler: class-Datei nicht gefunden");
        }
    }

    public Medium sucheNeuesMedium() {
        int index = 0;
        try {
            int neuesJahr = medienArrayList.get(0).getJahr();
//            int index = 0;

            for (int i = 1; i < medienArrayList.size(); i++) {
                if (neuesJahr < medienArrayList.get(i).getJahr()) {
                    neuesJahr = medienArrayList.get(i).getJahr();
                    index = i;
                }
            }

            //medienArrayList.get(index).druckeDaten(System.out);
            //System.out.println("Das aktuellste Jahr: " + neuesJahr);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Kein Medium ist vorhanden");
        }
        return medienArrayList.get(index);
    }

    public double berechneErscheinungsjahr() {
        if (medienArrayList.size() > 0) {
            double s = 0.0;
            for (int i = 0; i < medienArrayList.size(); i++) {
                s += medienArrayList.get(i).getJahr();
            }

            return s / medienArrayList.size();
        } else {
            return 0.0;
        }
    }
}
