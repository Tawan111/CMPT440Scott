/*
Tawan Scott
Professor Rivas
CMPT440
10 March 2020
*/

public class ManWolf {
	
	private static final int q0 = 0;
	private static final int q1 = 1;
	private static final int q2 = 2;
	private static final int q3 = 3;
	private static final int q4 = 4;
	private static final int q5 = 5;
	private static final int q6 = 6;
	private static final int q7 = 7;
	private static final int q8 = 8;
	private static final int q9 = 9;
	private static final int q10 = 10;
	private static int state;

	static private int[][] delta = {
	
		{q10, q10, q1, q10},
		{q10, q10, q0, q2},
		{q4, q3, q10, q1},
		{q10, q2, q5, q10},
		{q2, q10, q6, q10}, 
		{q7, q10, q3, q10},
		{q10, q7, q4, q10},
		{q5, q6, q10, q8},
	    {q10, q10, q9, q7},
		{q10, q10, q8, q10}
	};

	public void process(String input) {
		
		for(int i = 0; i < input.length(); i++) {
			int index = 0;
			char c = input.charAt(i);
			
			try {
				if(c == 'c')
					index = 0;
				else if(c == 'w')
					index = 1;
				else if(c == 'g')
					index = 2;
				else if(c == 'n')
					index = 3;
				state = delta[state][index];
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				state = q10;
			}
		}
	}
	
	public boolean accepted() {
		return state == q9;
	}
}

