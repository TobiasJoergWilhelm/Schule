package Februar17;

public class Thread100 extends Thread{
	
	private int ms;
	private int nr;
	private int anzahl;
	
	public Thread100(int ms, int nr){
		
		this.ms = ms;
		this.nr = nr;
		this.anzahl = 2000;
		this.start();
		
	}

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++){
			
			Thread100 t1 = new Thread100(1000, i);
			
		}

	}
	
	public void run(){
		
		System.out.println("Thread " + this.nr);
		
		for (int i = 0; i < this.anzahl; i++){
					
			try{
				Thread.sleep(ms);
			} catch (Exception e){
				e.printStackTrace();
			}
			
		}
		
	}

}
