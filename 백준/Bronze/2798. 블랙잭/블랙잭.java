import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	// 백준 
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] inp1 = br.readLine().split(" ");
        	int n = Integer.parseInt(inp1[0]);
        	int m = Integer.parseInt(inp1[1]);
        	
        	String[] inp2 = br.readLine().split(" ");
        	int[] cards = new int[n];
        	int res = 0;
        	
        	for (int i = 0; i < n; i++) {
        		cards[i] = Integer.parseInt(inp2[i]);
			}
        	
        	for (int i = 0; i < cards.length-2; i++) {
        		for (int j = i+1; j < cards.length-1; j++) {
        			for (int j2 = j+1; j2 < cards.length; j2++) {
        				int tcs = cards[i] + cards[j] + cards[j2];
        				if( tcs <= m ) {
        					res = Math.max(res, tcs);
        				}
					}
				}
			}
        	
        	bw.write(String.valueOf(res));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}