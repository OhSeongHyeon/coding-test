import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int axis = 0;
		
		for (int i = 0; i < n; i++) {
			axis += s.charAt(i) == '2' ? 1 : -1;
		}
		
		System.out.println(axis == 0 ? "yee" : (axis > 0 ? "2" : "e"));
	}

}