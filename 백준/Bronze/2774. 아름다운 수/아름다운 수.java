import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		/*
		Set<Character> set = new HashSet<>();
		
		while(t-- > 0) {
			for (char c : br.readLine().toCharArray()) {
				set.add(c);
			}
			sb.append(set.size()).append("\n");
			set.clear();
		}
		*/
		
		StringBuilder rmDupc = new StringBuilder();
		
		while(t-- > 0) {
			for (char c : br.readLine().toCharArray()) {
				String s = String.valueOf(c - '0');
				rmDupc.append(rmDupc.toString().contains(s) ? "" : s);
			}
			sb.append(rmDupc.length()).append("\n");
			rmDupc.setLength(0);
		}
		
		System.out.print(sb);
	}
	
}