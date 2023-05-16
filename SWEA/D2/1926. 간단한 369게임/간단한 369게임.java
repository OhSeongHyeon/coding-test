import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int syg = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			for (int i = 1; i <= syg; i++) {
				char[] ca = String.valueOf(i).toCharArray();
				boolean isSyg = false;
				
				for (int j = 0; j < ca.length; j++) {
					if(ca[j] == '3' || ca[j] == '6' || ca[j] == '9') {
						sb.append("-");
						isSyg = true;
					}
				}
				
				if(!isSyg) {
					sb.append(i);
				}
				
				sb.append(" ");
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}
	
}