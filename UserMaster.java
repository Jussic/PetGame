import java.util.Scanner;

public class UserMaster extends Pet {

	static int year;
	
	public static void checkAge () {
	if (year <= 1996 ){
	System.out.println("Welcome to the GAME");
	}
	else {
		System.out.println("Sorry, you are too young to play the GAME");
		System.exit(0);
	}
}    

	public static void main(String[] args) {
		    
	Scanner input = new Scanner(System.in);
	
	String name; 
	System.out.println ( "Please enter your name:");
		        name = input.nextLine();
		       
		        System.out.println("Please enter your birthday month number");
		        
		        int month = input.nextInt();
		        String monthString;
		        switch (month) {
		            case 1:  monthString = "January";
		                     break;
		            case 2:  monthString = "February";
		                     break;
		            case 3:  monthString = "March";
		                     break;
		            case 4:  monthString = "April";
		                     break;
		            case 5:  monthString = "May";
		                     break;
		            case 6:  monthString = "June";
		                     break;
		            case 7:  monthString = "July";
		                     break;
		            case 8:  monthString = "August";
		                     break;
		            case 9:  monthString = "September";
		                     break;
		            case 10: monthString = "October";
		                     break;
		            case 11: monthString = "November";
		                     break;
		            case 12: monthString = "December";
		                     break;
		            default: monthString = "Invalid month";
		                     break;
		        }
		        // System.out.println ( "Please enter the day you were born:");
		        System.out.println ( "Please enter the year you were born:");
		        year = input.nextInt();

		        System.out.println ( "Hello" + " " + name + " " );
		        //  "born on" + " " + monthString + " " + day + " " + year 
		        checkAge();  


	Pet myPet = new Pet ();
	
	myPet.petOptions();
	System.out.println();
    
	input.close(); 
}
}
