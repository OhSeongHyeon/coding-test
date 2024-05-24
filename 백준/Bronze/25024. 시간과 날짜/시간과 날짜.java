import java.io.*;
import java.time.YearMonth;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= t; i++) {
			String[] sp = br.readLine().split("\\s");
			int x = Integer.parseInt(sp[0]);
			int y = Integer.parseInt(sp[1]);
			sb.append(yornTime(x, y)).append(yornDate(x, y));
		}
		
		System.out.println(sb);
	}
	
	private static String yornTime(int x, int y) {
		return (0 <= x && x <= 23) && (0 <= y && y <= 59) ? "Yes " : "No ";
	}
	
	private static String yornDate(int x, int y) {
		if (x < 1 || x > 12) {
            return "No\n";
        }
		int tmp = 2020;
        YearMonth ym = YearMonth.of(tmp, x);
        return y >= 1 && y <= ym.lengthOfMonth() ? "Yes\n" : "No\n";
	}

}