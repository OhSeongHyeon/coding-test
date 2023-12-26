import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String dksh = "DKSH";
		int cnt = 0;
		
		//java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(dksh).matcher(input);
		//while(matcher.find()) cnt++;
		
//		int idxOf = input.indexOf(dksh);
//		
//		while(idxOf > -1) {
//			idxOf = input.indexOf(dksh, ++idxOf);
//			cnt++;
//		}
		int idxOf = -1;
		while((idxOf = input.indexOf(dksh, ++idxOf)) > -1) {
			cnt++;
		}
		
		System.out.println(cnt);
	}

}