package S2Day20;
import java.util.Scanner;


public class humanWeight {
	
	double weight;
	double height;
	
public humanWeight (double setWeight, double setHeight) {
	weight= setWeight;
	height=setHeight;
	
}
	
public double getBodyIndex() {
	double bodyIndex= weight/height;
		return bodyIndex;
}


public String getBodyWeight(double weight) {
	if (weight<= 150) {
		return ("You have good weight");
	}
	
	if (weight >=150) {
		return("You might be overweight");
	}
	
	else {
		return("You might be underweight");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		 System.out.println("Enter Weight");
		 double weight = scanner.nextInt();
		 
		 System.out.println("Enter Height");
		 double height = scanner.nextInt();
		 
		 
		 humanWeight humanWeight1= new humanWeight(weight, height);
		 
		 System.out.println(humanWeight1.getBodyIndex());
		 System.out.println(humanWeight1.getBodyWeight(humanWeight1.weight));
	}

}
