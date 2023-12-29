import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int l = Integer.parseInt(st1.nextToken());
		int p = Integer.parseInt(st1.nextToken());
		int participant = l * p;
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < 5; i++) {
			int np = Integer.parseInt(st2.nextToken());
			sb.append(np - participant).append(i < 5 ? " " : "");
		}
		
		System.out.println(sb);
	}

}