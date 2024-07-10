import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 5*n; i++) {
			switch (i/n + 1) {
				case 1: case 3: sb.append("@@@@@".repeat(n));
					break;
				default: sb.append("@".repeat(n));
					break;
			}
			sb.append("\n");
		}
        
        System.out.println(sb);
    }

}