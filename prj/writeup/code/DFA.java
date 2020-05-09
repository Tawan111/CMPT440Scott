/*
Tawan Scott
Professor Rivas
CMPT440
15 May 2020
*/
public final class DFA {
	
	private static final int q0 = 0; 
	private static final int q1 = 1; //BUS100
	private static final int q2 = 2; //MATH130
	private static final int q3 = 3; //MATH205
	private static final int q4 = 4; //MATH241
	private static final int q5 = 5; //CMPT120
	private static final int q6 = 6; //CMPT230
	private static final int q7 = 7; //CMPT330
	private static final int q8 = 8; //CMPT306
	private static final int q9 = 9; //CMPT307
	private static final int q10 = 10; //CMPT220
	private static final int q11 = 11; //CMPT308
	private static final int q12 = 12; //CMPT446
	private static final int q13 = 13; //CMPT422
	private static final int q14 = 14; //CMPT440
	private static final int q15 = 15; //CMPT424
	private static final int q16 = 16; //CMPT221
	private static final int q17 = 17; //CMPT331
	private static final int q18 = 18; //CMPT412
	private static final int q19 = 19; //CMPT414
	private static final int q20 = 20; //CMPT415
  	private static final int q21 = 21; //CMPT333
  	private static final int q22 = 22; //CMPT435
  	private static final int q23 = 23; //CMPT432
  	private static final int q24 = 24; //CMPT404
  	private static final int q99 = 99; //ERROR

  	private static final int[][] delta = {
		  
  			{q99, q1, q2, q3, q4, q5, q6, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q10, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q7, q8, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q9, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q11, q12, q13, q99, q99, q16, q99, q99, q99, q99, q99, q99, q99, q99}, 
  			{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q14, q15, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q17, q18, q19, q99, q21, q22, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q20, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q23, q24}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99}, 
	    	{q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99, q99} 	
  	};   
  	//check if the sequence of user input will reach the accepting state
  	public static boolean check(String sequence, String course) {

  		int state = q0;
  		char pickedCourse = course.charAt(0);
  		int acceptingState = courseSymbols(pickedCourse);

  		for (int i = 0; i < sequence.length(); i++) {
  			char symbol = sequence.charAt(i);
  			try {
  				state = delta[state][courseSymbols(symbol)];
  			} catch(ArrayIndexOutOfBoundsException j) {	
  				return false;
  			}
  		}
  		return state == acceptingState;
  	}
  	//provide course details based on the course symbol that user input
  	public static void courseDetails(String symbol) {
  		
  		switch (symbol) {
  		case "a":
  			System.out.println("BUS100");
  			System.out.println("Introduction to Business & Management");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("3 Credits");
  			break;
  		case "b": 
  			System.out.println("MATH130");
  			System.out.println("Introduction to Statistics");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("3 Credits");
  			break;
  		case "c": 
  			System.out.println("MATH205");
  			System.out.println("Discrete Mathematics");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "d": 
  			System.out.println("MATH241");
  			System.out.println("Calculus I");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "e": 
  			System.out.println("CMPT120");
  			System.out.println("Intro to Programming");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("3 Credits");
  			break;
  		case "f": 
  			System.out.println("CMPT230");
  			System.out.println("Software System and Analysis");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "g": 
  			System.out.println("CMPT330");
  			System.out.println("System Design");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "h": 
  			System.out.println("CMPT306");
  			System.out.println("Data Communications");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "i": 
  			System.out.println("CMPT307");
  			System.out.println("Calculus I");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "j": 
  			System.out.println("CMPT220");
  			System.out.println("Software Development I");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "k": 
  			System.out.println("CMPT308");
  			System.out.println("Database Management");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "l": 
  			System.out.println("CMPT446");
  			System.out.println("Computer Graphics");
  			System.out.println("Offered during Spring");
  			System.out.println("4 Credits");
  			break;
  		case "m": 
  			System.out.println("CMPT422");
  			System.out.println("Computer Org & Arch");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "n": 
  			System.out.println("CMPT440");
  			System.out.println("Formal Language and Computability");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("3 Credits");
  			break;
  		case "o": 
  			System.out.println("CMPT424");
  			System.out.println("Operating Systems");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "p": 
  			System.out.println("CMPT221");
  			System.out.println("Software Development II");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "q": 
  			System.out.println("CMPT331");
  			System.out.println("Theory of Program Language");
  			System.out.println("Offered during Fall");
  			System.out.println("3 Credits");
  			break;
  		case "r": 
  			System.out.println("CMPT412");
  			System.out.println("Robotics");
  			System.out.println("Offered during Spring");
  			System.out.println("3 Credits");
  			break;
  		case "s": 
  			System.out.println("CMPT414");
  			System.out.println("Game Design and Programming I");
  			System.out.println("Offered during Fall");
  			System.out.println("4 Credits");
  			break;
  		case "t": 
  			System.out.println("CMPT415");
  			System.out.println("Game Design and Programming II");
  			System.out.println("Offered during Spring");
  			System.out.println("4 Credits");
  			break;
  		case "u": 
  			System.out.println("CMPT333");
  			System.out.println("Language Study");
  			System.out.println("Offered during Spring");
  			System.out.println("4 Credits");
  			break;
  		case "v": 
  			System.out.println("CMPT435");
  			System.out.println("Algorithm Analysis and Design");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("3 Credits");
  			break;
  		case "w": 
  			System.out.println("CMPT432");
  			System.out.println("Design of Compilers");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("4 Credits");
  			break;
  		case "x": 
  			System.out.println("CMPT404");
  			System.out.println("Artificial Intelligence");
  			System.out.println("Offered during Fall and Spring");
  			System.out.println("3 Credits");
  			break;
  		default: 
  			System.out.println("Course symbol entered is not valid.");
  			break;
  		}
  	}
  	//the course symbol will be returned as an int which will be used to checked the DFA 
  	private static int courseSymbols(char symbol) {
  		
  		switch(symbol) {
  		case 'a': 
  			return 1;
  		case 'b': 
  			return 2;
  		case 'c': 
  			return 3;
  		case 'd': 
  			return 4;
  		case 'e': 
  			return 5;
  		case 'f': 
  			return 6;
  		case 'g': 
  			return 7;
  		case 'h': 
  			return 8;
  		case 'i': 
  			return 9;
  		case 'j': 
  			return 10;
  		case 'k': 
  			return 11;
  		case 'l': 
  			return 12;
  		case 'm': 
  			return 13;
  		case 'n': 
  			return 14;
  		case 'o': 
  			return 15;
  		case 'p': 
  			return 16;
  		case 'q': 
  			return 17;
  		case 'r': 
  			return 18;
  		case 's':
  			return 19;
  		case 't':
  			return 20;
  		case 'u':
  			return 21;
  		case 'v':
  			return 22;
  		case 'w':
  			return 23;
  		case 'x':
  			return 24;
  		default: 
  			return -1; 
  		}
  	}
}