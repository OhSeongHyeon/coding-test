import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int stations = 10;
		int currentCapacity = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < stations; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int off = Integer.parseInt(st.nextToken());
			int on = Integer.parseInt(st.nextToken());
			
			currentCapacity += on - off;
			
			if(currentCapacity > 10_000) {
				currentCapacity = 10_000;
			}
			
			max = Math.max(max, currentCapacity);
		}
		
		System.out.println(max);
	}

}