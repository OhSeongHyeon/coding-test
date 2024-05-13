import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in1 = br.readLine();
		String in2 = br.readLine();
		String[] sp1 = in1.split(":");
		String[] sp2 = in2.split(":");
		int sec1 = 0;
		int sec2 = 0;
		int[] stmp = {3600, 60, 1};
		
		for (int i = 0; i < sp1.length; i++) {
			sec1 += Integer.parseInt(sp1[i]) * stmp[i];
			sec2 += Integer.parseInt(sp2[i]) * stmp[i];
		}
		
		int sres = sec1 >= sec2 ? 24 * 3600 + sec2 - sec1 : sec2 - sec1;
		int hh = sres/3600;
		int mm = sres%3600/60;
		int ss = sres%3600%60;
		System.out.printf("%02d:%02d:%02d", hh, mm, ss);
	}

}