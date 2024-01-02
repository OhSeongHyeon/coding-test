import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int solved = Integer.parseInt(st.nextToken());
		int unionLv = Integer.parseInt(st.nextToken());
		int highestLv = Integer.parseInt(st.nextToken());
		
		if(solved >= 1000 && (unionLv >= 8000 || highestLv >= 260)) {
			System.out.println("Very Good");
		}else if(solved >= 1000) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}

}