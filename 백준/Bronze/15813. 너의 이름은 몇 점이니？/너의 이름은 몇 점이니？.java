import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name = br.readLine();
        int score = 0;
        
        for (int i = 0; i < n; i++) {
			char c = name.charAt(i);
			score += (c - 'A' + 1);
		}
        
        System.out.println(score);
    }

}