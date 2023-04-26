import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	// 백준 
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] inp = br.readLine().split(" ");
        	int a = Integer.parseInt(inp[0]);
        	int b = Integer.parseInt(inp[1]);
        	int c = Integer.parseInt(inp[2]);
        	int d = Integer.parseInt(inp[3]);
        	int e = Integer.parseInt(inp[4]);
        	int f = Integer.parseInt(inp[5]);
        	
        	for (int x = -999; x <= 999; x++) {
				for (int y = -999; y <= 999; y++) {
					if( a*x + b*y == c && d*x + e*y == f ) {
						bw.write(String.valueOf(x+" "+y));
					}
				}
			}
        	
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}