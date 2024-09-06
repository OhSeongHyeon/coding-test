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
		int ba2 = ba * 2;
		int cost = 0;
		
		if(ba2 <= ya + hu) {
			cost += ba2 * Math.min(x, y);
			int remain = Math.abs(x-y);
			int ba2Cost = ba2 * remain;
			cost += x > y ? Math.min(ya * remain, ba2Cost) : Math.min(hu * remain, ba2Cost);
		}else {
			cost += ya * x + hu * y;
		}
		
		System.out.println(cost);
	}
	
}