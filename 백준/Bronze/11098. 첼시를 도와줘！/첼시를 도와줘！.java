import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(n-- > 0) {
        	int p = Integer.parseInt(br.readLine());
        	int max = Integer.MIN_VALUE;
        	String maxNm = "";
        	
        	while(p-- > 0) {
        		String[] sp = br.readLine().split(" ");
        		int price = Integer.parseInt(sp[0]);
        		if(max > price) continue;
        		max = price;
    			maxNm = sp[1];
        	}
        	
        	sb.append(maxNm).append("\n");
        }

        System.out.print(sb);
    }
	
}