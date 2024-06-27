import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in;
        StringBuilder sb = new StringBuilder();
        
        while( !(in = br.readLine()).equals("0 0") ) {
        	String[] sp = in.split("\\s+");
        	int b = Integer.parseInt(sp[0]);
        	int n = Integer.parseInt(sp[1]);
        	double p = Math.pow(b, 1.0/n);
        	double r = Math.ceil(p);
        	double l = Math.floor(p);
        	double rp = Math.pow(r, n);
        	double lp = Math.pow(l, n);
        	sb.append(Math.abs(b-lp) > Math.abs(b-rp) ? (int) r : (int) l).append("\n");
        }
        
        System.out.println(sb);
    }

}