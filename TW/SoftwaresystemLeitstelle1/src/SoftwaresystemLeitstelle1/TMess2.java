package SoftwaresystemLeitstelle1;

public class TMess2 extends Thread{
	
	private TMessStation tms;
	
	public TMess2(TMessStation tms){
		
		this.tms = tms;
		start();
		
	}
	
public void run(){
	
	int anzHoch = 15;
	double hoch = 1.5;
	int anzRunter = 15;
	double runter = -1.62;
		
		int z = 0;
		
		while(z < 1000){
			
			z++;
			
			for(int i = 0; i < anzHoch; i++){
				
				double t2_neu = this.tms.getT2() + hoch;
				
				this.tms.setT2(t2_neu);
				
				
				try{
					Thread.sleep(150);
				} catch(Exception e){
					e.getStackTrace();
				}
				
			}
			
			for(int i = 0; i < anzRunter; i++){
				
				double t2_neu = this.tms.getT2() + runter;
				
				this.tms.setT2(t2_neu);
				
				
				try{
					Thread.sleep(1500);
				} catch(Exception e){
					e.getStackTrace();
				}
				
			}
			
		}
				
	}

	
}
