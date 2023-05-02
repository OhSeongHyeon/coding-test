import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int tc = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for (int i = 1; i <= tc; i++) {
				sb.append(String.format("#%d ", i));
				int days = Integer.parseInt(br.readLine());
				String[] inp = br.readLine().split("\\s");
				int[] arr = new int[days];
				
				for (int j = 0; j < days; j++) {
					arr[j] = Integer.parseInt(inp[j]);
				}
				
				int max = arr[days-1];
				int buy = 0;
				long cost = 0;
				long profit = 0;
				
				for (int j = days-2; j >= 0; j--) {
					if(max <= arr[j]) {
						profit += (max*buy) - cost;
						max = arr[j];
						buy = 0;
						cost = 0;
						continue;
					}
					buy++;
					cost += arr[j];
					if(j==0) {
						profit += (max*buy) - cost;
					}
				}
				
				sb.append(profit).append("\n");
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}