import java.io.*;
import java.util.*;

public class Main {
	// 백준
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	int n = Integer.parseInt(br.readLine());
        	String[] ninp = br.readLine().split("\\s");
        	int m = Integer.parseInt(br.readLine());
        	String[] minp = br.readLine().split("\\s");
        	Map<Integer, Integer> myCard = new HashMap<Integer, Integer>();
        	int[] cardPack = new int[m];
        	
        	for (int i = 0; i < m; i++) {
        		cardPack[i] = Integer.parseInt(minp[i]);
			}
        	
        	for (int i = 0; i < n; i++) {
        		myCard.put(Integer.parseInt(ninp[i]), 0);
			}
        	
        	for (int i = 0; i < m; i++) {
        		if(myCard.containsKey(cardPack[i])) {
        			sb.append("1").append(" ");
        			continue;
        		}
        		sb.append("0").append(" ");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}