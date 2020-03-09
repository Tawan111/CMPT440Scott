/*
Tawan Scott
Professor Rivas
CMPT440
10 March 2020
*/
import java.util.Scanner;

public class driverDFA {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter solution: ");
		String userInput = input.nextLine();
		ManWolf ans = new ManWolf();
		ans.process(userInput);
		
		if (ans.accepted()) 
			System.out.println("This is a solution.");
		else
			System.out.println("This is not a solution.");
	}
}