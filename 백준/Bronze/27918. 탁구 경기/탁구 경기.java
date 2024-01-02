import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = 0;
		int y = 0;
		
		while(n-- > 0) {
			if(x+2==y || y+2==x) {
				break;
			}
			String input = br.readLine();
			switch (input) {
				case "D": x++;
					break;
				case "P": y++;
					break;
			}
		}
		
		System.out.printf("%d:%d", x, y);
	}

}