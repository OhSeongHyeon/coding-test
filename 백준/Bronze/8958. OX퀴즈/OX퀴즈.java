import java.io.*;

public class Main {

	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int caseNum = Integer.parseInt(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	
        	while(caseNum-- > 0) {
        		String input = br.readLine();
        		char[] charArray = input.toCharArray();
        		int sum = 0;
        		int point = 1;
        		
        		for (int i = 0; i < charArray.length; i++) {
					String s = String.valueOf(charArray[i]);
					if( "O".equals(s) ) {
						sum += point++;
						continue;
					}
					point = 1;
				}
        		
        		sb.append(sum).append("\n");
        	}
			
        	bw.write(sb.toString());
			bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}