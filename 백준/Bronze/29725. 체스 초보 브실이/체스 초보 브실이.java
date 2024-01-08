import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int boardSize = 8;
		int score = 0;
		
		for (int i = 0; i < boardSize; i++) {
			String input = br.readLine();
			for(char c : input.toCharArray()) {
				score += Character.isUpperCase(c) ? score(c) : score(c) * -1;
			}
		}
		
		System.out.println(score);
	}

	private static int score(char c) {
		switch(c) {
			//case 'k': case 'K': return 0;
			case 'p': case 'P': return 1;
			case 'n': case 'N': return 3;
			case 'b': case 'B': return 3;
			case 'r': case 'R': return 5;
			case 'q': case 'Q': return 9;
		}
		return 0;
	}

}