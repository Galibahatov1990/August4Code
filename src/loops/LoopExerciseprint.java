package loops;

public class LoopExerciseprint {

	public static void main(String[] args) {
		
		
		int counter = 501;
		
		System.out.println("loop started");
		while(counter <=  1000) {
			
			if(counter % 2 == 0) {
				System.out.println(counter);
				
			}
			
			counter++;
		}
		
		System.out.println("Loop ended ");
	}
	
	

}
