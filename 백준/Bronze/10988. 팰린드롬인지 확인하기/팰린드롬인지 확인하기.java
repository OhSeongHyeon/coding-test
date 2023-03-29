import java.io.*;

public class Main {
	// 백준 10988번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String input = br.readLine();
        	char[] charArray = input.toCharArray();
        	int len = charArray.length;
        	int mid = 1 + len/2;
        	
        	for(int b = 0, e = len - 1; b < mid || e >= mid; b++, e--) {
        		char bwd = charArray[b];
        		char ewd = charArray[e];
        		if( bwd-ewd != 0 ) {
        			bw.write(String.valueOf("0"));
        			bw.flush();
        			return;
        		}
        	}
        	
        	bw.write(String.valueOf("1"));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}