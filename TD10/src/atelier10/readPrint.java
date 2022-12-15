package atelier10;

import java.io.File;
import java.util.Scanner;

public class readPrint {
  public static void main(String[] args) {
    try {
      // instance Scanner pour lire le contenu
      Scanner input = new Scanner(new File("/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD10/src/atelier10/adelaide.txt"));

      // lire chaque ligne dans le texte utilisant un loop
      while (input.hasNextLine()) {
        String line = input.nextLine();
        System.out.println(line);
      }

      
      input.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}



