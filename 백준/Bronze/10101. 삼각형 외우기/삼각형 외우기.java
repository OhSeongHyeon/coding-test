import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	// 백준 10101번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int a = Integer.parseInt(br.readLine());
        	int b = Integer.parseInt(br.readLine());
        	int c = Integer.parseInt(br.readLine());
        	
        	StringBuilder sb = new StringBuilder();
        	
        	if( a==60 && b==60 && c==60 ) {
        		sb.append("Equilateral");
        	}else if( (a+b+c==180) && (a==b || a==c || b==c) ) {
        		sb.append("Isosceles");
        	}else if( (a+b+c==180) && (a!=b && a!=c && b!=c) ) {
        		sb.append("Scalene");
        	}else {
        		sb.append("Error");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}