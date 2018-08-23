/*
 * Purpose of this program is to use Wrapper Objects, 
implements auto-boxing and unboxing, 
converts String to Double using valueOf, 
converts String to Integer using parseInt. 
The strings that you convert will come from Command Line Arguments.
Now including printf and String format concepts 
 * Author:Clarissa Mercado
 * Date: 8-21-18/8-22-18
 */
public class Wrapper {
	
	public static void main(String args[]) {
		
		//below will take the index from the string array typed in command line
		String myString = args[0];
		
		int a = Integer.parseInt(myString);
		double b = Double.parseDouble(myString);
		
		double c = (b+100);
		double d = (c+0.25);
		
		String line = String.format("End Value|%,.2f|", d);
		
		System.out.println("The value you entered: " + b + "\n" + " The value entered + 100 is: "
				+ c + "\n" + " The value entered + 0.25 is: " + d + "\n" + line);
		
		System.out.printf("%.1f%n", 9.8889);
		System.out.printf("My name is: %s%n", "joe");
	}
	
}
