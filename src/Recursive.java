import java.util.ArrayList;

public class Recursive {
	public static void main(String args[]){
	/*	ArrayList<Integer> theList = new ArrayList<Integer>();
		
		theList.add(2);
		theList.add(3);
		theList.add(5);
		theList.add(7);
		int sum=0;
		
		for(Integer item:theList){
			sum = sum+item;
		}
		System.out.print("The sum is: "+sum);
*/		
	
		System.out.println(recursiveMethod(5));
	}
	
	static int recursiveMethod(int x){

		if(x==1)
			return 1;
		else
				
			return x * recursiveMethod(x-1);
		
		}
	
}
