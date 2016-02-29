package Konto;

public class UI {
	
	public UI(){
		
		Konto konto = new Konto(123456, 0);
		new Mensch("Monika", konto);
		new Mensch("Rainer", konto);
		
	}

	public static void main(String[] args) {
		
		new UI();
				
	}

}
