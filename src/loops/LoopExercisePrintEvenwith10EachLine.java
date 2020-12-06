package loops;

public class LoopExercisePrintEvenwith10EachLine {

	public static void main(String[] args) {
		
		//Print 10 numbers on each line
		//502 504 506 508 510 512 514 516 518 520
		//522 524 526 528 530 532 534 536 538 540
		//542 544 546 548 550 552 554 556 580 600
		//....
		//982 984 986 988 900 902 904 906 908 1000
		
		int counter = 502;
		
		while(counter <= 1000) {
			
			if(counter % 20 == 0 ) {
				
				System.out.print( counter + " ");
				
				//add condition that checks if the counter is divisible by 20
				//println
				
				
				if(counter % 20 == 0) {
					System.out.print("\n");
					
					
				}
			}
			
			counter++;
		}
		 
		
		
		
	}

}
