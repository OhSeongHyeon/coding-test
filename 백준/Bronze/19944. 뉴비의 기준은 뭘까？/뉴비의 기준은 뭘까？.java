import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String res = "NEWBIE!";
        
        if(2 < m && m <= n) {
        	res = "OLDBIE!";
        }else if(n < m) {
        	res = "TLE!";
        }
        
        System.out.println(res);
    }

}