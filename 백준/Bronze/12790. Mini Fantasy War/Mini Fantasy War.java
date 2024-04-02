import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String in = br.readLine();
			int[] arr = Arrays.stream(in.split("\\s"))
				.mapToInt(Integer::parseInt)
				.toArray();
			
			int hp = arr[0] + arr[4] > 1 ? arr[0] + arr[4] : 1;
			int mp = arr[1] + arr[5] > 1 ? arr[1] + arr[5] : 1;
			int ac = arr[2] + arr[6] > 0 ? arr[2] + arr[6] : 0;
			int dc = arr[3] + arr[7];
			
			sb.append(hp + (5*mp) + (2*ac) + (2*dc)).append("\n");
		}
		
		System.out.println(sb);
	}

}