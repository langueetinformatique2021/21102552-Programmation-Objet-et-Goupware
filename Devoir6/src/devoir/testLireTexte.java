package devoir;

import java.io.IOException;

public class testLireTexte {
	public static void main(String[] args) throws FichierVide, IOException {
		LireTexte txt=new LireTexte("/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD9/src/atelier09/Nom.txt");
		txt.Ouvrir();
		txt.readWord();
		txt.Fermer();
		
        System.out.println("\nTester un document vide: ");

		LireTexte txt2 = new LireTexte("/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD9/src/atelier09/Test.txt");
		txt2.Ouvrir();
		
	}

}




