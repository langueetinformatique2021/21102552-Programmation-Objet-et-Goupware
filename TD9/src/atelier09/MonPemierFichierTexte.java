package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class MonPemierFichierTexte {
	static void main(String args[]) {
	try {
			/* ecrire un fichier txt */
			File writename = new File(".\\output.txt"); 
			writename.createNewFile(); /*creer new fichier*/
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write("nom prenom\r\n"); 
			out.flush(); 
			out.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void verifier(String str) throws Exception{
		String fileName = ".\\output.txt";
		//loading fichier local
		File file = new File(fileName);
	
        InputStreamReader read = new InputStreamReader(new FileInputStream(file),"UTF-8"); //编码格式	        
        BufferedReader bufferedReader = new BufferedReader(read);
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			if(line.startsWith("#")){
				continue;
			}
			if (line.contains(str)) {
				System.out.println("Exist "+line);
			}else {
				System.out.println(str+" notExist");
			}
		}
		bufferedReader.close();

	}
}

