package Februar22;

public class UserThread  implements Runnable{

	@Override
	public void run() {
		
		long anfang = System.currentTimeMillis();
		int prozent = 0;
		
		for(int i = 1; i < 5; i++){
			
			long l = 0;
			
			for(int k = 1; k < 6; k++){
				
				for(int j = 0; j < 50000000; j++){
					
					l++;
					
				}
				
				prozent = prozent + 5;
				System.out.println("Berechne! " + prozent + "%");
				
			}
			
			System.out.println("Fertig!");
			
		}
		
		long ende = System.currentTimeMillis();
		long diff = ende - anfang;
		System.out.println("\nBenötigte Zeit: " + diff + " ms");

	}
		
}


