import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int a = Integer.parseInt(sp[0]);
		int b = Integer.parseInt(sp[1]);
		int res = 1;
		
		for (int i = a; i <= b; i++) {
			int seq = i * (i+1) / 2;
			res = (res * seq)%14579;
			if(res == 0) break;
		}
		
		System.out.println(res);
	}

}