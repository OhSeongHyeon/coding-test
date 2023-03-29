import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] input = br.readLine().split(" ");
        	char[] charArray = input[0].toCharArray();
        	int len = charArray.length;
        	int system = Integer.parseInt(input[1]);
        	int decimal = 0;
        	
        	for (int i = len - 1, s = 0; i >= 0; i--, s++) {
				char c = charArray[i];
				int square = (int) Math.pow(system, s);
				
				if( c >= 'A' && c <= 'Z' ) {
					decimal += (c - 55) * square; // 'A' = 65
					continue;
				}
				decimal += (c - 48) * square; // '0' = 48
			}
        	
        	bw.write(String.valueOf(decimal));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}