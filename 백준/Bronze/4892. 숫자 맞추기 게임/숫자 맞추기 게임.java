import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String in;
		
		for(int i = 1; !(in = br.readLine()).equals("0"); i++ ) {
			int n0 = Integer.parseInt(in);
			int n1 = 3 * n0;
			int n2 = n1%2 == 0 ? n1/2 : (n1 + 1)/2;
			int n3 = 3 * n2;
			int n4 = n3 / 9;
			//sb.append(String.format("%d. %s %d\n", i, n1%2==0 ? "even" : "odd", n4));
			sb.append(i).append(". ").append(n1%2==0 ? "even " : "odd ").append(n4).append("\n");
		}
		
		System.out.println(sb);
	}

}