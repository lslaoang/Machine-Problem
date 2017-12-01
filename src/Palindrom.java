import java.util.Scanner;


public class Palindrom {
	
	public static void main(String args[]){
		
		String input = null;
		Scanner sc = new Scanner(System.in);
		
		Boolean isPal = null;
		
		System.out.print("Enter a word: ");
		input = sc.next();
		
		char[] left = new char[input.length()];
		char[] right = new char[input.length()];
		
		left = input.toCharArray();
		
		
		
		int l = input.length()-1;
		
			int a =0;
			for(int z = l; z>=0; z--){
			
				right[a] = left[z];
				a++;
			}
		
		for (int x = 0;x<=l; x++){
			
				if(right[x] == left[x]){
					isPal = true;
				}
				else{
					isPal = false;
				}
						
			}
			
			
			if(isPal){
				System.out.print("Palindrome");
			}
			else{
				System.out.print("Not a Palindrome!");
			}
	
	
	
	
	}
	
}
