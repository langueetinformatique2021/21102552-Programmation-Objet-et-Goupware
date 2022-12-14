package devoir;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
/**
 * Spécialisation de flots
 * @author shailynnxie
 *
 */
public class FileInputStreamTP7 extends FileInputStream {
	
	private final File file;
	
    public FileInputStreamTP7(String path) throws FileNotFoundException {
        super(path);
        this.file = new File(path);
    }
/**
 * Copie le texte
 * @param txt de type File, chemin de file.copy
 * @throws IOException
 * 
 */
    public void copie(File txt) throws IOException {
    	
		try {
	       	FileInputStream  fsource = new FileInputStream(file);
	    			byte[] tmp = new byte[(int)file.length()];
	    			fsource.read(tmp);
	    			fsource.close();
	    			
			FileOutputStream fcible = new FileOutputStream(txt);
			fcible.write(tmp);
			fcible.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    /**
     * Compresse le texte
     * @param txt du type File
     * @throws IOException
     */
    public void Compresse(File txt)throws IOException {
	
    try {
       	FileInputStream  fsource = new FileInputStream(file);
    			byte[] tmp = new byte[(int)file.length()];
    			fsource.read(tmp);
    			fsource.close();
		

		FileOutputStream fout = new FileOutputStream(
				new File(txt+".zip"));
		DataOutputStream fcible = new DataOutputStream(new DeflaterOutputStream(fout));
		
		fcible.write(tmp);
		fcible.close();

	} catch (IOException e) {
		e.printStackTrace();
	}
}

    /**
     * afficher les propriétés du fichier
     */
    public void Proprietes(){
    	System.out.println(this.file.getName());
    	System.out.println(this.file.getAbsolutePath());
    	System.out.println(this.file.length());
    }
    
    /**
     * Comparer le contenu des deux instances dans la classe FileInputStreamTP7
     * 
     * @param doc
     * @return boolean True(si contenu pareil) False (si contenu différent)
     * @throws IOException
     */
    public boolean CompareTo(FileInputStreamTP7 doc)throws IOException {
    	int txt1,txt2;
    	try {
            while ((txt1 = this.read()) != -1 && (txt2 = doc.read()) != -1) {
    		   
    		   if (txt1!=txt2) {
    			   return false;
    		   }
        }
    	   return true;
        } catch (IOException e) {
        // Handle any IO exceptions that may occur.
        e.printStackTrace();
      }
 	   return true;

   }
}
    
