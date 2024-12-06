import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
        int n1 = Integer.parseInt(input[0]);
        int n2 = Integer.parseInt(input[1]);
        int n12 = Integer.parseInt(input[2]);
        int totalRats = (int) Math.floor(((double) (n1 + 1) * (n2 + 1)) / (n12 + 1) - 1);
        System.out.println(totalRats);
	}

}