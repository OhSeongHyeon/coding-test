import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // trash
		int sum = -8;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreElements()) {
			sum += Integer.parseInt(st.nextToken()) + 8;
		}
		
		System.out.printf("%d %d", sum/24, sum%24);
	}

}