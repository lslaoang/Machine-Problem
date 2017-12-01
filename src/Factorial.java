import java.util.InputMismatchException;
import java.util.Scanner;


public class Factorial {
	
	private static double  factorial(int x){
		double result;
		if(x==0 || x==1)
			return x;
		else
			result = factorial(x-1) * x;
			return result;
		
	}
	
	public static void main(String args[]){

		try{
			int x;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a whole number: ");
			x = sc.nextInt();
			
			System.out.print("The factorial of "+ x +" = "+factorial(x));
			
		}catch(InputMismatchException e){
			System.out.print("Invalid input.");
		}
		
		
		
		
	}
	
	

}
