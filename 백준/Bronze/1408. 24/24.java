import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String current = br.readLine();
		String taskStart = br.readLine();
		int currSec = convertTimeToTotalSeconds(current);
		int taskStartSec = convertTimeToTotalSeconds(taskStart);
		int remainSec = currSec > taskStartSec ? (24 * 3600) + taskStartSec - currSec : taskStartSec - currSec;
		System.out.printf("%02d:%02d:%02d", remainSec/3600, remainSec%3600/60, remainSec%3600%60);
	}
	
	private static int convertTimeToTotalSeconds(String input) {
		String[] sp = input.split(":");
		int mapping = 3600 * 60;
		int totalSec = 0;
		
		for (int i = 0; i < sp.length; i++) {
			totalSec += Integer.parseInt(sp[i]) * (mapping /= 60);
		}
		
		return totalSec;
	}
	
}