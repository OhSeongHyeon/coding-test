import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int[] maxScores = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        int len = 9;
        int sum = 0;
        
        for (int i = 0; i < len; i++) {
			int sc = Integer.parseInt(sp[i]);
			if(sc > maxScores[i]) {
				System.out.println("hacker");
				return;
			}
			sum += sc;
		}
        
        System.out.println(sum >= 100 ? "draw" : "none");
    }

}