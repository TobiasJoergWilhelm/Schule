package Februar17;

public class MyThread extends Thread{
	
	private String Thraed;
	
	public MyThread(String thread){
		
		this.Thraed = thread;
		this.start();
		
	}

	public static void main(String[] args) {
		
		MyThread zt1 = new MyThread("***********Hallo ich bin Thread1");
		MyThread zt2 = new MyThread("****Hallo ich bin Thread2");
		
	}
	
	public void run(){
			
		for (int i = 0; i < 100; i++){
			
			System.out.println(this.Thraed + ", i = " + i);
			
			try{
				
				Thread.sleep(1000);
				
			}
			catch(Exception e){
				
				e.printStackTrace();
				
			}
			
		}
		
	}

}
