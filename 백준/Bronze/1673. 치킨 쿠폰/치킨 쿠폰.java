import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp;
        StringBuilder sb = new StringBuilder();
        
        while((inp = br.readLine()) != null && !inp.isEmpty()) {
        	String[] sp = inp.split("\\s+");
        	int n = Integer.parseInt(sp[0]);
        	int k = Integer.parseInt(sp[1]);
        	int t = n;
        	
        	while(n >= k) {
        		t += n / k;
        		n = n/k + n%k;
        	}
        	
        	sb.append(t).append("\n");
        }
        
        System.out.println(sb);
    }

}