import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			String[] inp = br.readLine().split("\\s");
			int p = Integer.parseInt(inp[0]);
			int k = Integer.parseInt(inp[1]);
			int cnt = 0;
			
			while(true){
				k++;
				cnt++;
				
				if(p == k) {
					bw.write(Integer.toString(++cnt));
					break;
				}
			}
			
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
}