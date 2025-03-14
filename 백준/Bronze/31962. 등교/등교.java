import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int n = Integer.parseInt(sp[0]);
        int x = Integer.parseInt(sp[1]);
        int max = -1;

        while (n-- > 0) {
            sp = br.readLine().split("\\s");
            int s = Integer.parseInt(sp[0]);
            int t = Integer.parseInt(sp[1]);
            
            if(s + t <= x) {
                max = Math.max(max, s);
            }
        }
        
        System.out.println(max);
    }

}