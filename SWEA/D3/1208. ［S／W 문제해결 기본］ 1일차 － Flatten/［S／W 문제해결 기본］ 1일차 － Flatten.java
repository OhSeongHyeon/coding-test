import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			StringBuilder sb = new StringBuilder();
			
			for (int i = 1; i <= 10; i++) {
				int dt = Integer.parseInt(br.readLine());
				int[] stcgBox = Arrays.stream(br.readLine().split("\\s"))
						.mapToInt(Integer::parseInt)
						.sorted()
						.toArray();
				
				for (int j = 0; j < dt; j++) {
					stcgBox[0]++;
					stcgBox[stcgBox.length-1]--;
					Arrays.sort(stcgBox);
				}
				
				int res = stcgBox[stcgBox.length-1] - stcgBox[0];
				sb.append(String.format("#%d %d\n", i, res));
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}