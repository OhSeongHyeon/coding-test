import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int tc = Integer.parseInt(br.readLine());
			
			for (int z = 1; z <= tc; z++) {
				String inp = br.readLine();
				String rev = new StringBuilder(inp).reverse().toString();
				bw.write(String.format("#%d %d\n", z, inp.equals(rev) ? 1 : 0));
			}
			
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
}