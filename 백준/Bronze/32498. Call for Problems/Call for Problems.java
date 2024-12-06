import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        int excludedCount = 0;

        for (int i = 0; i < n; i++) {
            int difficulty = Integer.parseInt(br.readLine());
            if (difficulty % 2 != 0) {
                excludedCount++;
            }
        }

        System.out.println(excludedCount);
	}

}