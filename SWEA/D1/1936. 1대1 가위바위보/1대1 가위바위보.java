import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			StringBuilder sb = new StringBuilder();
			
			if(a > b) {
				if(a==1 && b==3) {
					sb.append("B");
				}else {
					sb.append("A");
				}
			}else {
				if(a==3 && b==1) {
					sb.append("A");
				}else {
					sb.append("B");
				}
			}
			
			bw.write(sb.toString());
			bw.flush();
		}
	}

}