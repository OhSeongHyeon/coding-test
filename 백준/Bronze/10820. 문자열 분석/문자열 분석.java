import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String in;
		
		while((in = br.readLine()) != null && !(in.isEmpty())) {
			int locCnt = 0;
			int UpcCnt = 0;
			int DigCnt = 0;
			int blkCnt = 0;
			
			for(char c : in.toCharArray()) {
				if(Character.isLowerCase(c)) {
					locCnt++;
				}else if(Character.isUpperCase(c)) {
					UpcCnt++;
				}else if(Character.isDigit(c)) {
					DigCnt++;
				}else if(c == ' ') {
					blkCnt++;
				}
			}
			
			sb.append(String.format("%d %d %d %d\n", locCnt, UpcCnt, DigCnt, blkCnt));
		}
		
		System.out.println(sb);
	}

}