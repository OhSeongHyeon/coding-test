import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] days = new int[31 + 1];
		
		while(n-- > 0) {
			String[] sp = br.readLine().split(" ");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			
			for (int i = a; i < b; i++) {
				days[i]++;
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		
		for (int i = 1; i < days.length; i++) {
			if(k < days[i]) {
				System.out.println(0);
				return;
			}
		}
		
		System.out.println(1);
	}
	
}