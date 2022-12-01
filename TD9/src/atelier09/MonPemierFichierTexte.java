package atelier09;

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;


public class MonPemierFichierTexte {
	static void main(String args[]) {
	try {
			/* ecrire un fichier txt */
			File writename = new File(".\\result\\en\\output.txt"); 
			writename.createNewFile(); /*creer new fichier*/
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write("nom prenom\r\n"); 
			out.flush(); 
			out.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

