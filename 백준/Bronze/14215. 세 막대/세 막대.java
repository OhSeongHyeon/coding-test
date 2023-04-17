import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	// 백준 14215번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
    		String[] inps = br.readLine().split(" ");
    		int[] sides = {
				Integer.parseInt(inps[0])
			,	Integer.parseInt(inps[1])
			,	Integer.parseInt(inps[2])
			};
    		
    		// 배열 내림차순 정렬
			for (int i = 0; i < sides.length; i++) {
				for (int j = i+1; j < sides.length; j++) {
					if(sides[i] < sides[j]) {
						int temp = sides[i];
						sides[i] = sides[j];
						sides[j] = temp;
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();

			if(sides[0] >= (sides[1]+sides[2])) {
				int rslt = sides[1] + sides[2] + (sides[1]+sides[2]-1);
				sb.append(rslt);
			}else {
				sb.append(sides[0]+sides[1]+sides[2]);
			}
			
			bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}