/*
Tawan Scott
Developed in Eclipse
15 May 2020
*/
import java.io.*;

public class PrerequisiteValidator {
 
	public static void main(String[] args) throws IOException {
	  
		BufferedReader userInput =  new BufferedReader(new InputStreamReader(System.in));//Standard input      
		System.out.println("Course Symbols:");
		System.out.println("BUS100 = a   MATH130 = b  MATH205 = c  MATH241 = d  CMPT120 = e  CMPT230 = f");
		System.out.println("CMPT330 = g  CMPT306 = h  CMPT307 = i  CMPT220 = j  CMPT308 = k  CMPT446 = l");
		System.out.println("CMPT422 = m  CMPT440 = n  CMPT424 = o  CMPT221 = p  CMPT331 = q  CMPT412 = r");
		System.out.println("CMPT414 = s  CMPT415 = t  CMPT333 = u  CMPT435 = v  CMPT432 = w  CMPT404 = x");
		System.out.println();
		System.out.println("Please enter a course symbol that you desire to take.");
		String input = userInput.readLine();
      
		while (input != null) {
			DFA.courseDetails(input);
			System.out.println();
			System.out.println("Please enter courses that you wish to take leading to your chosen course.");
			String inputTwo = userInput.readLine();
			while (inputTwo != null) {
				if (DFA.check(inputTwo, input)) {
					System.out.println("You meet the prerequisite requirements to enroll in this course.");
					break;
				} else {
					System.out.println("Prerequisite requirements not met to enroll in this course.");
					break;
				}
			}
			System.out.println();
			System.out.println("Please enter a new course symbol.");
			input = userInput.readLine();
		}
	}
} 