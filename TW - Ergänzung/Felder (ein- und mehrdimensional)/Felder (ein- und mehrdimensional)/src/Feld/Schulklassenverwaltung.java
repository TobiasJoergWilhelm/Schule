package Feld;

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
	
	private FileReaderWriter frw = new FileReaderWriter();
	
	private String[][] schulklasse;
	
	private int zwei = 0;
	private int eins = 0;
	private int weiter = 0;
	
	private int[] jahr;
	private int[] monat;
	
	public Schulklassenverwaltung(){
		
		this.schulklasse = new String[this.frw.getLinesOfFile("txt/1011_11e_HEMS.txt")][3];
		this.jahr = new int[this.frw.getLinesOfFile("txt/1011_11e_HEMS.txt")];
		this.monat = new int[this.frw.getLinesOfFile("txt/1011_11e_HEMS.txt")];
	}
	
  public static void main(String[] args){

    FileReaderWriter frw = new FileReaderWriter();
    
    Schulklassenverwaltung skv = new Schulklassenverwaltung();

    // Programmkopf

    //String dateiName = "...."; // Verweis auf die zu verarbeitende Datei
    
    //String inhalt = frw.readFile(dateiName);
    
    //System.out.println(" In der Datei " + dateiName + " steht:");
    //System.out.println();
    //System.out.println(inhalt);
    
    System.out.println(frw.getLinesOfFile("txt/1011_11e_HEMS.txt"));
    
    skv.Aufgabe1();
    skv.Aufgabe2();
    
    skv.Aufgabe4();
        
    System.out.println("\n\n Das Programm wurde beendet...\n\n");
  }
  
  public void Aufgabe1(){
	  
	  String a = this.frw.readFile("txt/1011_11e_HEMS.txt");
	  String b = "";
	  
	  String klassenname = "";
	  String jahrgang = "";
	  String schule = "";
	  
	  int zahl = 0;
	  int d = 0;
	  int zahl2 = 0;
	  
	  
	  for(int i = 0; i < a.length() - 1; i++){
		  
		  if(a.codePointAt(i) != 59 && a.codePointAt(i) != 10){
			  
			  
			  b = b + a.charAt(i);
			  
		  }
		  
		  if(a.charAt(i) == 10 && zahl == 2){
			  
			  jahrgang = b;
			  b = "";
			  zahl++;
			  
		  }
		  
		  if (a.charAt(i) == 59 && zahl == 1){
			  
			  klassenname = b;
			  b = "";
			  zahl++;
			  
		  }
		  
		  if(a.charAt(i) == 59 && zahl == 0){
			  
			  schule = b;
			  b = "";
			  zahl++;
			  
		  }
		  
		  if(a.charAt(i) == 10){
		
			  System.out.println("Schule:   " + schule);
			  System.out.println("Klasse:   " + klassenname);
			  System.out.println("Jahrgang: " + jahrgang);
			  
			  this.weiter = i;
			  i = a.length();
			  
		  }
		  
	  }
	  
	 
		  
		  
	  
  }
  
  public void Aufgabe2(){
	
	  String a = this.frw.readFile("txt/1011_11e_HEMS.txt");
	  String b = "";
	  
	  for (int i = this.weiter + 1; i < a.length(); i++){
		  
		  if(a.charAt(i) != 59 && a.charAt(i) != 10){
			  
			  b = b + a.charAt(i);
			  
		  }
		  
		  if(a.charAt(i) == 59 || a.charAt(i) == 10){
			  
			  
			  
			  this.schulklasse[this.eins][this.zwei] = b;
			  b = "";
			  this.zwei++;
			  
			  if(this.zwei == 3){
				  
				  this.eins++;
				  this.zwei = 0;
				  
			  }
			  
		  }
		  
	  }
	  
	  for(int i = 0; i < this.frw.getLinesOfFile("txt/1011_11e_HEMS.txt") - 1; i++){
		  
		  System.out.println("\nNachname:     " + this.schulklasse[i][0]);
		  System.out.println("Vorname:      " + this.schulklasse[i][1]);
		  System.out.println("Geburtsdatum: " + this.schulklasse[i][2]);
					  
	  }
	   
  }
  
  public void Aufgabe4(){
	  
	  Date d = new Date(System.currentTimeMillis());
	  System.out.println(d.getDate() + "." + (d.getMonth() + 1) + "." + (d.getYear() + 1900));
	  
	  String[] jahr = new String[this.frw.getLinesOfFile("txt/1011_11e_HEMS.txt")];
	  String[] monat = new String[this.frw.getLinesOfFile("txt/1011_11e_HEMS.txt")];
	  String a = "";
	  
	  for(int i = 0; i < this.frw.getLinesOfFile("txt/1011_11e_HEMS.txt") - 1; i++){
		  
		  
		  
		  
		  
	  }
	  
  }
  
}