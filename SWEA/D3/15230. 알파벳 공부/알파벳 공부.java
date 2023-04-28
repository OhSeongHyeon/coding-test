import java.io.*;

public class Solution {

	public static void main(String[] args) {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
			int tc = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			for(int i = 1; i <= tc; i++) {
				char a = 'a';
				String inp = br.readLine();
				boolean isSkip = true;
				for (int j = 0; j < inp.length(); j++) {
					if(inp.charAt(j) != a) {
						sb.append(String.format("#%d %d\n", i, j));
						isSkip = false;
						break;
					}
					a++;
				}
				if(isSkip) {
					sb.append(String.format("#%d %d\n", i, inp.length()));
				}
			}
			
			bw.write(sb.toString());
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}