package ObjektSpeichern_Demo;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       /* Schachtel meineSchachtel = null;

        try (FileInputStream fis = new FileInputStream("foo.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            meineSchachtel = (Schachtel) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        Schachtel meineSchachtel = new Schachtel();
        meineSchachtel.setBreite(75);
        meineSchachtel.setHoehe(40);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fs);
            oos.writeObject(meineSchachtel);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
