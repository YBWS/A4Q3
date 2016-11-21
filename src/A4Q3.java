import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
public class A4Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
        boolean fizz;
        boolean buzz;
		
		for (int i = 1; i <= 100; i++){
			fizz = i % 3 == 0;
			buzz = i % 5 == 0;
	        if (fizz && buzz)
	        	System.out.println("FizzBuzz");
	        else if (fizz)
	        	System.out.println ("Fizz");
	        else if (buzz)
	        	System.out.println("Buzz");
	        else
	        	System.out.println(i);
		    
		}
		        
		userInput.close();

	}

}
