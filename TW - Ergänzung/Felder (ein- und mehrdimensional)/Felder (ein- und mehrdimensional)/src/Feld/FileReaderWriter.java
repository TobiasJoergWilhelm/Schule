package Feld;

import java.util.*;
import java.io.*;
/**
* FileReaderWriter
*
* Bietet Methoden zum Lesen und Schreiben aus bzw. in Dateien.
*
* AB_Datenverarbeitung_mit_Dateien_ProgUeb_FileReaderWriter.doc
*
* @version 1.0 vom 30.03.2012
* @author J. Mang
*/

public class FileReaderWriter{

  
  /**************************************************
  * Methoden
  **************************************************/
  
  /**
  * readFile
  * liest den Inhalt aus einer Datei mit dem Namen datName in eine Zeichenkette
  * text ein und gibt die eingelesene Zeichenkette zur�ck.
  * Jeder Zeile der Datei ist mit einem Zeilenbruch abgeschlossen.
  *
  * Beispiel:
  * Eine Datei daten.txt enth�lt folgende Zeilen:
  * abc 01
  * def 02
  * ghi 03
  *
  * R�ckgabe f�r den String text:
  * "abc 01\ndef 02\nghi 03\n"
  *
  * ******************************
  * @param datName String
  * @return text String
  */
  public String readFile(String datName){

    File f = new File(datName);  // File-Objekt erzeugen
    String text = ""; // der ganze Text der Txt-Datei

    try{
      // Stream- und BufferedReader-Objekt erzeugen

      FileInputStream fis = new FileInputStream(f);
      InputStreamReader isr = new InputStreamReader(fis, "UTF8");
      BufferedReader br = new BufferedReader(isr);

      String line = ""; // eine einzelne Zeile

      System.out.println();

      // Schleife zum zeilenweise Einlesen der Datei

      while((line = br.readLine())!=null){
        // Zeilenweise Einlesen der Datei und �bergabe in den String
        text = text + line + "\n";  // Abschluss mit Zeilenumbruch
      }

      br.close();    // Schlie�en des BufferedReader
    }
    catch (IOException e) {;
      e.printStackTrace();
    }

    return text;
  }
  /**
  * writeFile
  * schreibt einen String s in die Datei mit dem Namen datName
  *
  * ******************************
  * @param datName String
  * @param s String
  * @return void
  */
  public void writeFile(String datName, String s){
    
     try{
    
      // Nachfolgende Funktion: Etwas in ein File schreiben
      
      // Objekt der Klasse "FileWriter", die u.A. ein Schreiben in eine Datei erm�glich
      
      File f = new File(datName); 
      
      // Ausgabe-Stream anlegen
      FileOutputStream fos = new FileOutputStream(f);
      OutputStreamWriter w = new OutputStreamWriter(fos, "UTF8");
      BufferedWriter writer = new BufferedWriter(w);      
      
      // Inhalt, der geschrieben wird: Der komlette String mit Namen s
      
      writer.write(s);
      
      writer.close(); // Schlie�en des FileWriters
      
    }
    catch (IOException e) {
    
      String name = e.getClass().getName();  
      String msg  = e.getMessage();  
      String msgString    = e.toString();  
      System.out.println( name ); 
      System.out.println( msg );
      System.out.println( msgString );
      
      e.printStackTrace();
    }       
  }
    /**
  * getLinesOfFile
  * gibt die vorhandenen Zeilen der Datei mit dem Namen datName zur�ck.
  *
  * Beispiel:
  * Eine Datei daten.txt enth�lt folgende Zeilen:
  * abc 01
  * def 02
  * ghi 03
  *
  * R�ckgabe lautet: 3
  * 
  * ******************************
  * @param datName String
  * @return anzahlLines int
  */
  public int getLinesOfFile(String datName){
  
    File f = new File(datName);  // File-Objekt erzeugen
    int anzahlLines = 0;

    try{
      // Stream- und BufferedReader-Objekt erzeugen

      FileInputStream fis = new FileInputStream(f);
      InputStreamReader isr = new InputStreamReader(fis, "UTF8");
      BufferedReader br = new BufferedReader(isr);

      String line = ""; // eine einzelne Zeile

      System.out.println();

      // Schleife zum zeilenweise Einlesen der Datei

      while((line = br.readLine())!=null){
        // Zeilenweise Einlesen der Datei und �bergabe in den String
        anzahlLines++;
      }

      br.close();    // Schlie�en des BufferedReader
    }
    catch (IOException e) {;
      e.printStackTrace();
    }

    return anzahlLines;  
  
  }
  
}