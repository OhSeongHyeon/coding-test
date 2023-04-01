import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	// 백준 11005번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	Map<Integer, String> rn = new HashMap<>();
        	for(int i = 10; i < 36; i++) {
        		char c = (char) (i+55);
        		rn.put(i, String.valueOf(c));
        	}
        	String[] split = br.readLine().split(" ");
        	int n = Integer.parseInt(split[0]);
        	int s = Integer.parseInt(split[1]);
        	int rst = n;
        	
        	StringBuilder sb = new StringBuilder();
        	
        	while(rst > 0) {
        		int rs = rst % s;
        		rst /= s;
        		if(rs > 9) {
        			sb.append(rn.get(rs));
        			continue;
        		}
        		sb.append(rs);
        	}
        	
        	bw.write(sb.reverse().toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}