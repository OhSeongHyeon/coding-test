import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cur = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			cur += b - a;
			if(cur > 10_000) cur = 10_000;
			max = Math.max(max, cur);
		}

		System.out.println(max);
	}

}