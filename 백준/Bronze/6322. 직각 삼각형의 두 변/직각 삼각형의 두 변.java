import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] edgeName = {"a", "b", "c"};
		int seq = 1;
		String in;
		
		while( !(in = br.readLine()).equals("0 0 0") ) {
			String[] sp = in.split("\\s");
			int[] arr = Arrays.stream(sp)
				.mapToInt(Integer::parseInt)
				.toArray();
			double printLength = 0;
			boolean isPos = true;
			int idx = -1;
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == -1) idx = i;
			}
			
			sb.append(String.format("Triangle #%d\n", seq++));
			
			if(idx == 2) {
				double asq = Math.pow(arr[0], 2);
				double bsq = Math.pow(arr[1], 2);
				printLength = Math.sqrt(asq + bsq);
			}else {
				double csq = Math.pow(arr[2], 2);
				double aorbsq = Math.pow(idx == 1 ? arr[0] : arr[1], 2);
				double ressq = csq - aorbsq;
				if(ressq <= 0) {
					isPos = false;
				}else {
					printLength = Math.sqrt(ressq);
				}
			}
			
			sb.append(String.format(isPos ? "%s = %.3f\n\n" : "Impossible.\n\n", edgeName[idx], printLength));
		}
		
		System.out.println(sb);
	}

}