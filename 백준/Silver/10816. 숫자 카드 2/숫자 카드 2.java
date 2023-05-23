import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	int[] card = new int[20_000_001];
        	int tenMillion = 10_000_000;
        	int n = Integer.parseInt(br.readLine());
        	String[] nInp = br.readLine().split("\\s");
        	
        	for (int i = 0; i < n; i++) {
        		int idx = Integer.parseInt(nInp[i]) + tenMillion;
				card[idx]++;
			}
        	
        	int m = Integer.parseInt(br.readLine());
        	String[] mInp = br.readLine().split("\\s");
        	
        	for (int i = 0; i < m; i++) {
        		int target = Integer.parseInt(mInp[i]) + tenMillion;
				sb.append(card[target]).append(" ");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}