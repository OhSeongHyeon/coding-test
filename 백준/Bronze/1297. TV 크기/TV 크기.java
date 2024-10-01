import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int D = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int W = Integer.parseInt(input[2]);
        
        double ratio = Math.sqrt(H * H + W * W);
        double k = D / ratio;
        
        int actualHeight = (int) (H * k);
        int actualWidth = (int) (W * k);
        
        System.out.println(actualHeight + " " + actualWidth);
    }
	
}