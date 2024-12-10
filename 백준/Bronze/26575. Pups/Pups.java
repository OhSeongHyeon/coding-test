import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            double d = Double.parseDouble(input[0]);
            double f = Double.parseDouble(input[1]);
            double p = Double.parseDouble(input[2]);
            double totalCost = d * f * p;
            sb.append(String.format("$%.2f", totalCost)).append("\n");
        }
        
        System.out.print(sb);
	}

}