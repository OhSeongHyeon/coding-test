import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(t-- > 0) {
        	String[] sp = br.readLine().split("\\s+");
        	long a = Long.parseLong(sp[0]);
            long b = Long.parseLong(sp[1]);
            sb.append(a / b * a / b).append("\n");
        }
        
        System.out.println(sb);
    }

}