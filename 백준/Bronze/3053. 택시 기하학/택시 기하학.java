import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		double euclidean = r * r * Math.PI;
		double taxiGeometry = 2.0 * r * r;
		System.out.printf("%.6f\n%.6f", euclidean, taxiGeometry);
	}

}