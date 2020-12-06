package loops;

public class FizzBuzzInterviewQuestion {

	public static void main(String[] args) {
		
		
		
		int counter = 1;
		while(counter <= 100) {
			
			if ((counter % 3 == 0) &&  (counter % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (counter % 5 == 0) {
				System.out.println("Buzz");
			} else if (counter % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(counter);
				

				
				
			}
		     counter++;
		     
		     
		     // 3 components of loop:
		     // starting point:
		     // Ending point: -> condition of the loop needs to eventually false
		     // Increment/Decrement -> counter should be there to incremental/decremental(track)
		     //the number of iterations
			
		}
					
		
	}

}
