import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String rl = br.readLine();
		String[] minSp = rl.replaceAll("6", "5").split("\\s+");
		String[] maxSp = rl.replaceAll("5", "6").split("\\s+");
		int minA = Integer.parseInt(minSp[0]);
		int minB = Integer.parseInt(minSp[1]);
		int maxA = Integer.parseInt(maxSp[0]);
		int maxB = Integer.parseInt(maxSp[1]);
		System.out.println((minA+minB) + " " + (maxA+maxB));
	}

}