import java.util.Scanner;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter score");
		double grade= scanner.nextDouble();
		
		if (grade <= 100 && grade >= 90)
		System.out.println("My score in the class is A");
		
		else if (grade <= 89 && grade >= 80)
			System.out.println("My score in the class is B");
		
		else if (grade <= 79 && grade >= 70)
			System.out.println("My score in the class is C");
		
		else if (grade <= 69 && grade >= 60)
			System.out.println("My score in the class is D");
		else if (grade <= 59 && grade >= 0)
			System.out.println("My score in the class is F");
		
	}

}

