import java.util.Scanner;

public class Fish extends Pet {
	
		static Scanner input = new Scanner (System.in);

		int FishAge;
		static String userInput = input.next();
		
		public Fish (String name) {
		System.out.println("The name of your fish is:" + name);	
		}
		
		public void setAge (int age) {
			FishAge = age;
		}
		
		public int getAge () {
		System.out.println("Fish age is:" +  FishAge);
		return FishAge; 
		}
		
		public static void main (String[] args) {
			Fish myFish = new Fish (userInput);
			
			myFish.setAge(0);
		    myFish.getAge( );
		    
		    System.out.println( myFish.FishAge ); 

		}
			
	} 
