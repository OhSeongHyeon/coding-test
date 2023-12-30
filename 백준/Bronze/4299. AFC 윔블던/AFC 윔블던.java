import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if((a+b)%2 == 1 || a < b) {
			System.out.print(-1);
			return;
		}
		int n = (a + b)/2;
        int m = a - n;
        System.out.format("%d %d", n, m);
	}

}