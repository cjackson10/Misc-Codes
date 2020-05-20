package Temp2Assignment;

import java.util.Scanner;

public class Temp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("Temperature in Celsius:"+celsius);  
		
} 
}