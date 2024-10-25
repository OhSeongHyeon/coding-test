import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] alpha = new int['z'-'a'+1];
        
        while(n-- > 0) {
        	int[] arr = br.readLine()
    			.toLowerCase()
        		//.replaceAll("[^a-z]", "")
        		.chars()
        		.filter(Character::isLowerCase)
        		.distinct()
        		.sorted()
        		.toArray();
        	
        	if(arr.length == alpha.length) {
        		sb.append("pangram\n");
        		continue;
        	}else {
        		sb.append("missing ");
        	}
        	
        	for(int i : arr) {
        		alpha[i-'a']++;
        	}
        	for (int i = 0; i < alpha.length; i++) {
				if(alpha[i] == 0) {
					sb.append((char) (i+'a'));
				}
			}
        	sb.append("\n");
        	Arrays.fill(alpha, 0);
        }
        
        System.out.println(sb);
    }
}