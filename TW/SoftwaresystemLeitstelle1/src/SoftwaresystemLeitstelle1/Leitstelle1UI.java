package SoftwaresystemLeitstelle1;

public class Leitstelle1UI {
	
	private TMessStation tms = null;
	
	public Leitstelle1UI(){
		
		this.tms = new TMessStation(50, 20);
		
	}

	public static void main(String[] args) {
		
		Leitstelle1UI l1 = new Leitstelle1UI();
		
		if(l1.tms != null){
			
			
			TMess1 t1 = new TMess1(l1.tms);
			TMess2 t2 = new TMess2(l1.tms);
			
			System.out.println("Gestartet!");
			System.out.println("Startwert t1: " + l1.tms.getT1());
			System.out.println("Startwert t2: " + l1.tms.getT2() + "\n\n");
			
		}
		else{
			System.out.println("Nicht gestartet!");
		}
		int i = 0;
		
		while(i < 100){
			
			i++;
			
			try{
				Thread.sleep(2000);
				System.out.println("Momentan t1: " + l1.tms.getT1());
				System.out.println("Momentan t2: " + l1.tms.getT2() + "\n\n");			
			} catch(Exception e){
				e.printStackTrace();
			}
			
			
			
		}
		
		System.out.println("Endergebniss: \n t1: " + l1.tms.getT1() + "\nt2: " + l1.tms.getT2());
		
		
	}

}
