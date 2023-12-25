import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		int res = 0;
		
		if(n < 5) {
			res = p;
		}else if(n < 10) {
			int dis = p - 500;
			res = dis < 0 ? 0 : dis; 
		}else if(n < 15) {
			int dis = p - 500 < 0 ? 0 : p - 500;
			int dr = p - p * 10 / 100;
			res = dis <= dr ? dis : dr;
		}else if(n < 20) {
			int dis = p - 2000 < 0 ? 0 : p - 2000;
			int dr = p - p * 10 / 100;
			res = dis <= dr ? dis : dr;
		}else if(n <= 30) {
			int dis = p - 2000 < 0 ? 0 : p - 2000;
			int dr = p - p * 25 / 100;
			res = dis <= dr ? dis : dr;
		}
		
		System.out.println(res);
	}

}