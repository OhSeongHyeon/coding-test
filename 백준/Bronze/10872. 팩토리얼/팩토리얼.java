import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int num = Integer.parseInt(br.readLine());
        	int fac = 1;
        	for(int i = num; i > 1; i--) {
        		fac *= i;
        	}
        	
        	bw.write(String.valueOf(fac));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}