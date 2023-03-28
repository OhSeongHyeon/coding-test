import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String input = br.readLine().toUpperCase();
        	char[] ca = input.toCharArray();
        	char[] rmdCa = rmDuplicates(ca);
        	int[] cntAlpha = new int[rmdCa.length];
        	
        	for (int i = 0; i < rmdCa.length; i++) {
				for(char c : ca) {
					if( rmdCa[i] == c ) {
						cntAlpha[i] = ++cntAlpha[i];
					}
				}
			}
        	
        	int max = cntAlpha[0];
        	int maxIdx = 0;
        	for (int i = 0; i < cntAlpha.length; i++) {
        		if( max < cntAlpha[i] ) {
        			max = cntAlpha[i];
        			maxIdx = i;
        		}
			}
        	
        	int duplCheck = 0;
        	for (int i = 0; i < cntAlpha.length; i++) {
        		if( cntAlpha[i] == max ) {
        			duplCheck++;
        		}
			}
        	
        	StringBuilder sb = new StringBuilder();
        	if( duplCheck > 1 ) {
        		sb.append("?");
        		bw.write(sb.toString());
    			bw.flush();
    			return;
        	}
        	
        	sb.append(rmdCa[maxIdx]);
        	bw.write(sb.toString());
			bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
	
	private static char[] rmDuplicates(char[] ca) {
		if(ca.length == 0) {
			return ca;
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for (char c : ca) {
			if( set.add(c) ) {
				sb.append(c);
			}
		}
		return sb.toString().toCharArray();
	}
}