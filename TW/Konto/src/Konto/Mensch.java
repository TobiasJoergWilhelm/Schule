package Konto;

public class Mensch extends Thread{

	private Konto konto;
	private String name;
	
	public Mensch(String name, Konto konto){
		
		this.konto = konto;
		this.name = name;
		start();
		
	}
	
	public void run(){
		
		
		
	}
}