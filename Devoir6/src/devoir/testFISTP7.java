package devoir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 
 * @author shailynnxie
 *
 */
public class testFISTP7 { public static void main(String[] args) throws IOException {
    try {
    	String chemin = "/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD9/src/atelier09/Nom.txt";
    	 FileInputStreamTP7 doc = new FileInputStreamTP7(chemin );
    	 
    	 
    	 File cop = new File( "/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD9/src/atelier09/NomCopy.txt");
    	 doc.copie(cop);
    	 doc.Compresse(cop);
    	 
    	 doc.Proprietes();
    	 FileInputStreamTP7 document = new FileInputStreamTP7("/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD9/src/atelier09/NomCopy.txt");
    	 

    	 System.out.println(doc.CompareTo(document));
    	 doc.close();
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }

}
	
}