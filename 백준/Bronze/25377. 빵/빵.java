import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int res = -1;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a > b) {
				continue;
			}
			if(min > b - a) {
				min = b - a;
				res = b;
			}
		}
		
		System.out.println(res);
	}

}