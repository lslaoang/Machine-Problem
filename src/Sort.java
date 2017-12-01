

import java.lang.String;
import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		
		int[] inputNum = new int[5];
		
		
			System.out.println("Enter ten whole numbers: ");
				for(int x = 0;x<5;x++){
				inputNum[x] = sc.nextInt();
			}
		
		System.out.print(Arrays.toString(inputNum));
	}
}
