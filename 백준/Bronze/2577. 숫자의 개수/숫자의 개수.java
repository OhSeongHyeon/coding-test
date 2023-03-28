import java.io.*;

public class Main {

	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	int mul = 1;
        	int[] cntArr = new int[10];
        	for (int i = 1; i <= 3; i++) {
        		mul *= Integer.parseInt(br.readLine());
			}
        	
    		char[] charArray = String.valueOf(mul).toCharArray();
    		for (int j = 0; j < charArray.length; j++) {
				int n = Character.getNumericValue(charArray[j]);
				cntArr[n] = ++cntArr[n];
			}
    		
    		for (int k = 0; k < cntArr.length; k++) {
    			sb.append(cntArr[k]).append("\n");
			}
    		
        	bw.write(sb.toString());
			bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}