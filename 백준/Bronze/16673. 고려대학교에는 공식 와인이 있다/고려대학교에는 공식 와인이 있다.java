import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s+");
        int c = Integer.parseInt(sp[0]);
        int k = Integer.parseInt(sp[1]);
        int p = Integer.parseInt(sp[2]);
        int sum = 0;
        
        for (int n = 1; n <= c; n++) {
			sum += k*n + p*n*n;
		}
        
        System.out.println(sum);
    }

}