package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class MonPemierFichierTexte {
	static void main(String args[]) {
	try {
			/* ecrire un fichier txt */
			File writename = new File("/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD9/src/atelier09/Nom.txt"); 
			writename.createNewFile(); /*creer new fichier*/
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write("Xie Shilin"); 
			out.flush(); 
			out.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Verifier());

	}
	public static boolean Verifier() {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(new File("/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD9/src/atelier09/Nom.txt")));
			if (br.readLine().equals("Xie Shilin") == false)
				return false;
			//if (br.readLine().equals("Claude Montacié") == false)
				//return false;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
		
	}
}

