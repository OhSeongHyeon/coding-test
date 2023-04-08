import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	// 백준 2581번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int m = Integer.parseInt(br.readLine());
        	int n = Integer.parseInt(br.readLine());
        	int sum = 0;
        	int min = 0;
        	StringBuilder sb = new StringBuilder();
        	
        	for (int i = m; i <= n; i++) {
        		boolean isPrime = true;
        		if(i < 2) {
        			continue;
        		}
        		
        		for (int j = 2; j < i; j++) {
        			if(i%j == 0) {
        				isPrime = false;
        				break;
        			}
				}
        		
        		if(isPrime) {
        			sum += i;
        			if(min == 0) {
        				min = i;
        			}
        		}
        	}
        	
        	if(sum > 0 && min > 0) {
        		sb.append(sum)
        			.append("\n")
        			.append(min);
        	}else {
        		sb.append("-1");
        	}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}