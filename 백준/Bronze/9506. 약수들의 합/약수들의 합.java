import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	// 백준 9506번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	int n;
        	while( (n = Integer.parseInt(br.readLine())) != -1) {
        		List<Integer> divisors = new ArrayList<Integer>();
        		for (int i = 1; i < n; i++) {
        			if(n%i == 0) {
        				divisors.add(i);
        			}
				}
        		
        		int sum = divisors.stream().reduce(0, Integer::sum);
        		
        		if(sum != n) {
        			sb.append(String.format("%d is NOT perfect.\n", n));
        			continue;
        		}
        		
        		sb.append(n).append(" = ");
        		for (int i = 0; i < divisors.size(); i++) {
        			sb.append(divisors.get(i));
        			if( (i+1) < divisors.size() ) {
        				sb.append(" + ");
        			}
				}
        		sb.append("\n");
        	}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
