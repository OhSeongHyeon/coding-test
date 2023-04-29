import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int c = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= c; i++) {
				String[] inp = br.readLine().split(" ");
				int sum = 0;
				for (int j = 0; j < inp.length; j++) {
					int n = Integer.parseInt(inp[j]);
					sum += n;
				}
				double res = sum/10.0;
				sb.append(String.format("#%d %.0f\n", i, res));
			}
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}