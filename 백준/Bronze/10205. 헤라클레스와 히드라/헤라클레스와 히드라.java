import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= k; i++) {
        	int h = Integer.parseInt(br.readLine());
        	
        	for(char c : br.readLine().toCharArray()) {
        		h += c == 'c' ? 1 : -1;
        	}
        	
        	sb.append(String.format("Data Set %d:\n%d\n\n", i, h));
		}
        
        //sb.setLength(sb.length()-2);
        System.out.println(sb);
    }

}