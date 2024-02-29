import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inArr = br.readLine().split("\\s");
		//int n = Integer.parseInt(inArr[0]);
		int x = Integer.parseInt(inArr[1]);
		int k = Integer.parseInt(inArr[2]);
		
		while(k-- > 0) {
			String[] sp = br.readLine().split("\\s");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			if(a == x || b == x) {
				x = x == a ? b : a;
			}
		}
		
		System.out.println(x);
	}

}