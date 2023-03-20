import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
	        StringTokenizer nw = new StringTokenizer(br.readLine());
	        int a = Integer.parseInt(nw.nextToken());
	        int b = Integer.parseInt(nw.nextToken());
	        
	        if(a<b) {
	        	System.out.println("<");
	        }else if(a>b) {
	        	System.out.println(">");
	        }else if(a==b) {
	        	System.out.println("==");
	        }
		}
	}
}