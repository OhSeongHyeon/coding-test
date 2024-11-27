import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String pattern = "WOW";

        while(n-- > 0) {
            String input = br.readLine();
            int inpLen = input.length();
            int patLen = pattern.length();
            int count = 0;

			for (int j = 0; j <= inpLen - patLen; j++) {
                if (input.substring(j, j + patLen).equals(pattern)) count++;
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
	
}