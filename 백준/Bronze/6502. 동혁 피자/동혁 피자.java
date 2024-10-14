import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int seq = 1;
        String in;
        
        while( !(in = br.readLine()).equals("0") ) {
        	String[] sp = in.split(" ");
        	double r = Double.parseDouble(sp[0]);
        	double w = Double.parseDouble(sp[1]);
        	double l = Double.parseDouble(sp[2]);
        	double sqrt = Math.sqrt(Math.pow(l/2, 2) + Math.pow(w/2, 2));
        	String ann = r >= sqrt ? "fits on the table.\n" : "does not fit on the table.\n";
        	sb.append(String.format("Pizza %d %s", seq++, ann));
        }
        
        System.out.print(sb);
    }
	
}