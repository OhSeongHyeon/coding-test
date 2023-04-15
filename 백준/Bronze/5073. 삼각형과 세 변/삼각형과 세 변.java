import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	// 백준 5073번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	while (true) {
        		String[] inps = br.readLine().split(" ");
        		int a = Integer.parseInt(inps[0]);
        		int b = Integer.parseInt(inps[1]);
        		int c = Integer.parseInt(inps[2]);
				if(a==0 && b==0 && c==0) break;
				
				int[] sides = {a, b, c};
				for (int i = 0; i < sides.length; i++) {
					for (int j = i+1; j < sides.length; j++) {
						if(sides[i] < sides[j]) {
							int temp = sides[i];
							sides[i] = sides[j];
							sides[j] = temp;
						}
					}
				}
				
				if(sides[0] >= (sides[1]+sides[2])) {
					sb.append("Invalid").append("\n");
					continue;
				}
				
				if(a==b && a==c && b==c) {
					sb.append("Equilateral").append("\n");
				}else if((a==b && a!=c && b!=c) || (a!=b && a==c && b!=c) || (a!=b && a!=c && b==c)) {
					sb.append("Isosceles").append("\n");
				}else if(a!=b && a!=c && b!=c) {
					sb.append("Scalene").append("\n");
				}
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}