import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                int x = s / (n + 1);
                sb.append(x).append("\n");
            }
        }

        System.out.print(sb);
	}

}