import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] quadrant = new int[5];
		
		while(n-- > 0) {
			String[] coordinate = br.readLine().split("\\s");
			int x = Integer.parseInt(coordinate[0]);
			int y = Integer.parseInt(coordinate[1]);
			
			if(x == 0 || y == 0) { // axis
				quadrant[0]++;
			}else if(x > 0 && y > 0) {
				quadrant[1]++;
			}else if(x < 0 && y > 0) {
				quadrant[2]++;
			}else if(x < 0 && y < 0) {
				quadrant[3]++;
			}else if(x > 0 && y < 0) {
				quadrant[4]++;
			}
		}
		
		for (int i = 1; i < quadrant.length; i++) {
			sb.append("Q").append(i).append(": ").append(quadrant[i]).append("\n");
		}
		
		System.out.println(sb.append("AXIS: ").append(quadrant[0]));
	}

}