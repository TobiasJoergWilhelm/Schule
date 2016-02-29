import java.util.*;
import java.io.*;
/**
* Schulklassenverwaltung
*
* siehe AB:
* DO_Felder_DV_mit_Dateien_ProgUeb_Schulklassenverwaltung_Info_und_A1-A4.doc
*
* @version 1.0 vom 13.12.2013
* @author J. Mang
*/

public class Schulklassenverwaltung{

  // Attribute der Klasse
  //Scanner sc = new Scanner(System.in); // falls Benutzereingabe aktiviert
  
  /**************************************************
  * Methoden
  **************************************************/
  
  /**
  * main-Methode: Start der Anwendung
  * @param args String[] (optional)
  */
  public static void main(String[] args){

    FileReaderWriter frw = new FileReaderWriter();

    // Programmkopf

    //String dateiName = "...."; // Verweis auf die zu verarbeitende Datei
    
    //String inhalt = frw.readFile(dateiName);
    
    //System.out.println(" In der Datei " + dateiName + " steht:");
    //System.out.println();
    //System.out.println(inhalt);
    
    System.out.println(frw.getLinesOfFile("1011_11e_HEMS.txt"));
    
    System.out.println("\n\n Das Programm wurde beendet...\n\n");
  }
  
}