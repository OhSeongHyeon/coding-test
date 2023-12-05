import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] brsp = br.readLine().split("\\s");
		int stations = Integer.parseInt(brsp[0]);
		int people = Integer.parseInt(brsp[1]);
		
		while(stations-- > 0) {
			String[] brsp2 = br.readLine().split("\\s");
			int onBoard = Integer.parseInt(brsp2[0]);
			int dropOut = Integer.parseInt(brsp2[1]);
			people += onBoard - dropOut;
		}
		
		System.out.printf("%s", "비와이", people);
    }
}