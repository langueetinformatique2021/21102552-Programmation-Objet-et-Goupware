package atelier09;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class MonPremierFichierTexte1 {

	public static void main(String[] args) {

		try {
			PrintWriter pr = new PrintWriter(new File("/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD9/src/atelier09/Nom.txt"));
			pr.println("Xie Shilin");
			pr.println("Qian Yuyan");
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
