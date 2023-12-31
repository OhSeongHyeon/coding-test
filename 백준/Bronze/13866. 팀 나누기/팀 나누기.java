import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int c0 = Math.abs((a+b) - (c+d));
		int c1 = Math.abs((a+c) - (b+d));
		int c2 = Math.abs((a+d) - (b+c));
		System.out.println(Math.min(c0, Math.min(c1, c2)));
	}

}