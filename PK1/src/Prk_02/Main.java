package Prk_02;

import java.awt.HeadlessException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) throws InputException, IOException, HeadlessException, EmptyFilenameException {
			Menu m1 = new Menu();
			m1.menu();			
				
	}
	
	// Aufgabe 28
	static void copy(File from, File to) throws FileNotFoundException, IOException {
		try (InputStream in = new FileInputStream(from); 
				OutputStream out = new FileOutputStream(to)) {
			int c;
			
			while ((c = in.read()) != -1) 
				out.write(c);
				
			in.close(); 
			out.close(); 
		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(null, "Keine Datei ist vorhanden");
		} catch (IOException e) {				
			e.printStackTrace();
		}
	}
	
	//Aufgabe 28b
	static void cat(File quelle) throws FileNotFoundException, IOException {
		try (RandomAccessFile datei = new RandomAccessFile(quelle, "r")) {
			int c;

			while ((c = datei.read()) != -1) {
				System.out.print((char) c);
				c = datei.read();
			}
			datei.close();
		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(null, "Keine Datei ist vorhanden");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
