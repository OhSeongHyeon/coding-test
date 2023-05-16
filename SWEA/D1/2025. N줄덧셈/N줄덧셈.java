import java.io.*;
import java.util.*;

public class Solution {
	
	public static int sum = 0;

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int tc = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			sb.append(String.format("%d", sum(tc)));
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
	public static int sum(int n) {
		if(n==0) {
			return sum;
		}
		sum += n;
		return sum(--n);
	}
	
}