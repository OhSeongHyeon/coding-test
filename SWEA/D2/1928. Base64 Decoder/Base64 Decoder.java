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
			for (int c = 1; c <= tc; c++) {
				String inp = br.readLine();
				sb.append(String.format("#%d ", c));
				byte[] ba = Base64.getDecoder().decode(inp);
				for (int i = 0; i < ba.length; i++) {
					sb.append((char) ba[i]);
				}
				sb.append("\n");
			}
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}