import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int leadingTime = 45;
			
			int alarmMinute = m - leadingTime;
			int alarmHour = h;
			
			if(alarmMinute < 0) {
				alarmHour = h - 1;
				if(alarmHour < 0) {
					alarmHour = 23;
				}
				alarmMinute += 60;
			}
			System.out.printf("%d %d", alarmHour, alarmMinute);
		}
	}
}