import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int a = Integer.parseInt(sp[0]);
		int b = Integer.parseInt(sp[1]);
		int c = Integer.parseInt(sp[2]);
		int m = Integer.parseInt(sp[3]);
		int fatigueLv = 0;
		int output = 0;
		
		for (int i = 0; i < 24; i++) {
			int work = fatigueLv + a;
			if(work <= m) {
				output += b;
				fatigueLv = work;
			}else {
				int pause = fatigueLv - c;
				fatigueLv = pause > 0 ? pause : 0;
			}
		}
		
		System.out.println(output);
	}
	
}