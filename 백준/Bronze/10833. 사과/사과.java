import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int remain = 0;
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int students = Integer.parseInt(st.nextToken());
			int apples = Integer.parseInt(st.nextToken());
			remain += apples%students;
		}
		
		System.out.println(remain);
	}

}