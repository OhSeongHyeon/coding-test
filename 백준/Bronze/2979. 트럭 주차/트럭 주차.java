import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s+");
		int a = Integer.parseInt(sp[0]);
		int b = Integer.parseInt(sp[1]);
		int c = Integer.parseInt(sp[2]);
		int[] tl = new int[101];
		int curTr = 0;
		int res = 0;
		
		for (int i = 0; i < sp.length; i++) {
			String[] sp2 = br.readLine().split("\\s+");
			int ar = Integer.parseInt(sp2[0]);
			int de = Integer.parseInt(sp2[1]);
			tl[ar]++;
			tl[de]--;
		}
		
		for (int i = 0; i < tl.length; i++) {
			curTr += tl[i];
			switch (curTr){
				case 1: res += a;
					break;
				case 2: res += b * 2;
					break;
				case 3: res += c * 3;
					break;
			}
		}
		
		System.out.println(res);
	}

}