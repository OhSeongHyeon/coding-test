import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int e = Integer.parseInt(sp[0]);
		int s = Integer.parseInt(sp[1]);
		int m = Integer.parseInt(sp[2]);
		int ec = 1;
		int sc = 1;
		int mc = 1;
		int cnt = 1;
		
		while( !(e==ec && s==sc && m==mc) && cnt++ > 0 ) {
			ec = ec%15 == 0 ? 1 : ec+1;
			sc = sc%28 == 0 ? 1 : sc+1;
			mc = mc%19 == 0 ? 1 : mc+1;
		}
		
		System.out.println(cnt);
	}

}