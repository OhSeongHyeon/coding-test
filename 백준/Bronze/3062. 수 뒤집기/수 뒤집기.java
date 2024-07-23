import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder sbRev = new StringBuilder();
		
		while(t-- > 0) {
			String inp = br.readLine();
			String inpRev = sbRev.append(inp).reverse().toString();
			sbRev.setLength(0);
			int no = Integer.parseInt(inp);
			int nr = Integer.parseInt(inpRev);
			int m = no + nr;
			String mRev = sbRev.append(m).reverse().toString();
			sbRev.setLength(0);
			String moStr = String.valueOf(m);
			String mrStr = String.valueOf(mRev);
			sb.append(moStr.equals(mrStr) ? "YES\n" : "NO\n");
		}
		
		System.out.print(sb);
	}

}