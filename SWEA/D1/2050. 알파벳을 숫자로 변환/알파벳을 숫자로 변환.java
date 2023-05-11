import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			char[] inp = br.readLine().toCharArray();
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < inp.length; i++) {
				char c = inp[i];
				int n = c - 'A' + 1;
				sb.append(n).append(" ");
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
}