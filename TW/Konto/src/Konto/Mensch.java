package Konto;

import java.util.Random;

public class Mensch extends Thread{

	private Konto konto;
	private String name;
	
	
	public Mensch(String name, Konto konto){
		
		this.konto = konto;
		this.name = name;
		start();
		
	}
	
	public void run(){
		
		Random zufallsgenerator = new Random();
		int betrag;
		konto.einzahlen(500); //Monatsanfang, Geld einzahlen
		
		System.out.println(name + " hat 500 Euro eingezahlt.          Neuer Kontostand: " + this.konto.getKtoStand() + " Euro\n");
		
		for(int i = 1; i < 21; i++){
			
			betrag = zufallsgenerator.nextInt(50) + 50;
			System.out.println(name + " will " + betrag + " Euro abheben.");
			
			if(this.konto.getKtoStand() - betrag > 0){
				
				this.konto.auszahlen(betrag);
				System.out.println("-> " + name + " hat " + betrag + " Euro abgehoben.        Neuer Kontostand: " + this.konto.getKtoStand() + "      (Abhebung Nr." + i + ")");
			}
			else{
				
				System.out.println("Nicht genügend Guthaben.     Abhebung Nr. " + i + ")");
				this.konto.einzahlen(250);
				System.out.println(name + " hat 250 Euro eingezahlt.          Neuer Kontostand: " + this.konto.getKtoStand() + " Euro\n");
				
			}
			
			try{
				Thread.sleep(zufallsgenerator.nextInt(5000));
			} catch(Exception e){
				e.getStackTrace();
			}
			
		}
		
	}
}
