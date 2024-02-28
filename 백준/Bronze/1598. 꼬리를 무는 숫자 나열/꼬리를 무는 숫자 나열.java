import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int a = Integer.parseInt(sp[0]);
		int b = Integer.parseInt(sp[1]);
		int x = a <= b ? a : b;
		int y = a <= b ? b : a;
		int aRowIdx = x%4 == 0 ? 4 : x%4;
		int bRowIdx = y%4 == 0 ? 4 : y%4;
		int v1 = aRowIdx - bRowIdx;
		int v = Math.abs(v1);
		int h = (y - x + v1) / 4;
		System.out.println(v + h);
	}

}