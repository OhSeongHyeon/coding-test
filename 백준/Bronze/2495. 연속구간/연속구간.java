import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
			String s = br.readLine();
			char[] ca = s.toCharArray();
			int pre = Character.getNumericValue(ca[0]);
			int max = 1;
			int cnt = 1;
			
			for (int j = 1; j < ca.length; j++) {
				int curr = Character.getNumericValue(ca[j]);
				if(pre != curr) {
					pre = curr;
					max = Math.max(max, cnt);
					cnt = 1;
					continue;
				}
				cnt++;
			}
			
			max = Math.max(max, cnt);
			sb.append(max).append("\n");
		}

        System.out.print(sb);
    }

}