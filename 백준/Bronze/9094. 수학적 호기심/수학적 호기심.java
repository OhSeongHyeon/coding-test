import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(t-- > 0) {
        	String[] sp = br.readLine().split("\\s+");
        	int n = Integer.parseInt(sp[0]);
        	int m = Integer.parseInt(sp[1]);
        	int cnt = 0;
        	
        	for (double b = 2.0; b < n; b++) {
				for (double a = 1.0; a < b; a++) {
					cnt += ((a*a+b*b+m)/(a*b))%1 == 0 ? 1 : 0;
				}
			}
        	
        	sb.append(cnt).append("\n");
        }
        
        System.out.println(sb);
    }

}