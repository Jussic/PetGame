import java.util.Scanner;

public class Pet {

	int age; 
	double userNumber; double weight; double height; double money = 1.00;
	String color; String userAnswer; String food;
	
	private int theHealth;
	Scanner input = new Scanner (System.in);

	/* --------------------------  CHECK VARIABLES ----------------------------------*/
	// CHECK THE HEALTH METHOD
	public void checkHealth () {
	if (theHealth == 10 ){
	 	 System.out.println("Optimum Health! :D");
	 }
	 else if (theHealth <= 10 && theHealth > 0) {
	 	 System.out.println("I'm not the best, but I'll be fine");
	 }
	 else if ( theHealth == 0 ) {
	 	 System.out.println("Critical and in need of health");
	 }
	 else {
	 	 System.out.println("You ran out of health and died." + " " +  "BYE FELICIA!");
	 	 restartGame();
	 }
	}
	// CHECK FUNDS 
	public void checkFunds()
	{
		if (money == 0.00 )
		{
		 System.out.println("You ran out of health and died." + " " +  "BYE FELICIA!");
	 	 restartGame();
		}
	}
	
	/* --------------------------  PET, GAME OPTIONS < RESTART < QUIT ----------------------------------*/
	// RESTART OR QUIT GAME 
	public void restartGame() {
	System.out.println(" Would you like to play again?");
	userAnswer = input.next();
	if ( userAnswer.equalsIgnoreCase("yes")) {		
			 theOptions();
	}
	else if (userAnswer.equalsIgnoreCase("no")) {
		    System.out.println("See you next time, goodbye!");
		    System.exit(0);
	}
	else {	restartGame();
	}
}
	// OPTIONS METHOD 
	public void theOptions () {
	System.out.println("What would you like to do?");
	System.out.println("Choose 'eat', 'sleep', 'walk' or 'Q' to quit");

	userAnswer = input.next();	
	if ( userAnswer.equalsIgnoreCase("eat")) {		
		eat();
		theOptions();
	}
	else if ( userAnswer.equalsIgnoreCase("walk")) {
	System.out.println("How far should I walk?"); 
	userNumber = input.nextDouble();	
    
	while (userNumber <= 4.5) {
    	if (userNumber >= 3.0){
    	System.out.println("WALKING. . .");

    		try {Thread.sleep(6000);}
    		catch (Exception e) {}	
    	}
    	else {
    	System.out.println("WALKING. . .");
    			
    		try {Thread.sleep(6000);}
    		catch (Exception e) {}	
    	}
    		theOptions();
    }
}
	else if (userAnswer.equalsIgnoreCase("sleep")) {
		sleep();
	}
	else if (userAnswer.equalsIgnoreCase("Q")) {
	    System.out.println("See you next time, goodbye!");
		System.exit(0);
	}
	else {
		System.out.println("Please choose an activity for your pet");
		System.out.println(theHealth);
		theOptions();
	}
}
	
	// CHOOSE PET METHOD
	public void petOptions () {
		System.out.println("What Pet would you like?");
		System.out.println("Choose 'puppy', 'fishy' or 'Q' to quit");

		userAnswer = input.next();	
		if ( userAnswer.equalsIgnoreCase("puppy")) {		
			System.out.println("Please choose a name for your pup");
			
			userAnswer = input.next();	
			Puppy myPup = new Puppy(userAnswer);
			myPup.getAge();
			theOptions();
		}
		else if (userAnswer.equalsIgnoreCase("fishy")) {
			System.out.println("Please choose a name for your fish");
			
			userAnswer = input.next();	
			Fish myFish = new Fish(userAnswer);
			myFish.getAge();
			theOptions();
		}
		else if (userAnswer.equalsIgnoreCase("Q")) {
		    System.out.println("See you next time, goodbye!");
			System.exit(0);
		}
		//else if ( userAnswer.equalsIgnoreCase("birdy")) {}
		else {
			System.out.println("Please choose a pet");
			petOptions();
		}
	}

	
	/* ----------------------------------------------------------------------------------------------*/
	
	// SLEEP METHOD
	public void sleep () {
	theHealth++;
	checkHealth(); System.out.println("Goodnight");
	restartGame();
	}
	
	// EAT METHOD
	public void eat () { 
	System.out.println("I'm hungry, let me have a snack please");
	System.out.println("Choose YES or NO");
	 userAnswer = input.next();
	 if ( userAnswer.equalsIgnoreCase("yes")) {
		 checkFunds(); 
		 theHealth++; System.out.println(theHealth);
		 checkHealth(); theOptions();
	 }
	else if (userAnswer.equalsIgnoreCase("no")) {
		 theHealth--; System.out.println(theHealth);
		 checkHealth(); theOptions();
	 }  
	else {
		 checkHealth(); theOptions();
	}
}  
	// WALK METHOD
	public int walk (int theMiles) {
	theHealth++; System.out.println(theHealth);
	int petExcercise = theMiles;
	return petExcercise; 
 }
}