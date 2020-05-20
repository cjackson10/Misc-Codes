package NumberAboveAverage;

import java.util.Scanner;
import java.util.Arrays;

public class NumberAboveAverage {
	
	public static void main (String args []) {
		
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter the length of the array:");
    int length = keyboard.nextInt();

    int [] temperatures = new int [length];
 
    int sum = 0;
    
    for(int i=0; i<temperatures.length; i++ ) {
    	System.out.println("Please enter temperatures");
       
    	temperatures[i] = keyboard.nextInt();
    	
    	sum = sum + temperatures[i];
    }
    
    
    double average = sum / temperatures.length;
	
	System.out.println("The average temperature is: " + average);
	
	
    for(int i = 0; i < temperatures.length; i++) {
    if(temperatures[i] > average) {
    
    System.out.println("This temperature is above the average:" + temperatures[i]);
   
    
    }
   
    }
	}
}
    
		
	
	
	

	

