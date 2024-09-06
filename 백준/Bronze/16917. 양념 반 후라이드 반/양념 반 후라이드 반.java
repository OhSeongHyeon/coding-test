import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int ya = Integer.parseInt(sp[0]);
		int hu = Integer.parseInt(sp[1]);
		int ba = Integer.parseInt(sp[2]);
		int x = Integer.parseInt(sp[3]);
		int y = Integer.parseInt(sp[4]);
		int cost = 0;
		
		if(ba * 2 <= ya + hu) {
			cost += ba * 2 * (x < y ? x : y);
			cost += x > y ? Math.min(ya * (x-y), ba * 2 * (x-y)) : Math.min(hu * (y-x), ba * 2 * (y-x));
		}else {
			cost += ya * x + hu * y;
		}
		
		System.out.println(cost);
	}
	
}