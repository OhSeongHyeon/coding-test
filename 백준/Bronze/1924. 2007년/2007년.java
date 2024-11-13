import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int m = Integer.parseInt(in[0]);
        int d = Integer.parseInt(in[1]);

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] weekDays = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        int totalDays = 0;
        for (int i = 0; i < m - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += d;

        String resultDay = weekDays[totalDays % 7];
        System.out.println(resultDay);
    }

}