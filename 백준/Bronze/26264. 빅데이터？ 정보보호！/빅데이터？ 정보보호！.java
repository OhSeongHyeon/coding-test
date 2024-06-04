import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String inp = br.readLine();
		int sl = inp.replaceAll("[^s]", "").length();
		int bl = inp.replaceAll("[^b]", "").length();
		
		if(sl == bl) {
			System.out.println("bigdata? security!");
			return;
		}
		System.out.println(sl > bl ? "security!" : "bigdata?");
	}

}