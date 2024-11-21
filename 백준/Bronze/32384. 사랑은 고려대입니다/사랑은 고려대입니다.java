import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n-- > 0) sb.append("LoveisKoreaUniversity").append(" ");
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
	
}