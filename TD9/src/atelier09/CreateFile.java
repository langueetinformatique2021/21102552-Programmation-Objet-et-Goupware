package atelier09;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
    try {
      // Specify the file path and name
      File file = new File("/Users/shailynnxie/git/21102552-Programmation-Objet-et-Goupware/TD9/src/atelier09/Test.txt");

      // Create the file if it does not exist
      if (!file.exists()) {
        file.createNewFile();
      }

      // Write content to the file
      FileWriter fw = new FileWriter(file);
      fw.write("Hello World!");
      fw.close();
    } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }



