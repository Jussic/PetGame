public class Puppy {
	
	int puppyAge;
	
	public Puppy (String name) {
	System.out.println("The name of your pup is:" + name);	
	}
	
	public void setAge (int age) {
		puppyAge = age;
	}
	
	public int getAge () {
	System.out.println("Pup's age is:" +  puppyAge);
	return puppyAge; 
	}
	
	public static void main (String[] args) {
		Puppy myPuppy = new Puppy (null);
		
		myPuppy.setAge(0);
	    myPuppy.getAge( );
	    
	    // System.out.println( myPuppy.puppyAge ); 

	}
		
}