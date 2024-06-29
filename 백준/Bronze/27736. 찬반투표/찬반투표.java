import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sp = br.readLine().split("\\s+");
        int mid = n%2 == 0 ? n/2 : n/2 + 1;
        int axis = 0;
        
        for (int i = 0; i < n; i++) {
			int v = Integer.parseInt(sp[i]);
			mid += v == 0 ? -1 : 0;
			axis += v;
		}
        
        if(mid < 1) {
        	System.out.println("INVALID");
        }else {
        	System.out.println(axis > 0 ? "APPROVED" : "REJECTED");
        }
    }

}