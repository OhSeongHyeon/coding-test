import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			switch (m) {
				case 136: sum += 1000;
					break;
				case 142: sum += 5000;
					break;
				case 148: sum += 10000;
					break;
				case 154: sum += 50000;
					break;
			}
		}
		
		System.out.println(sum);
	}
	
}