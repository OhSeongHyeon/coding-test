import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int n = Integer.parseInt(sp[0]);
        StringBuilder sb = new StringBuilder();
        
        while(n-- > 0) {
        	sb.append(new StringBuilder(br.readLine()).reverse()).append("\n");
        }
        
        System.out.println(sb);
    }

}