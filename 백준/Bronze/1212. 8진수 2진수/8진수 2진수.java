import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = br.readLine();
    	StringBuilder sb = new StringBuilder();
    	int len = input.length();
    	
    	for (int i = 0; i < len; i++) {
    		int nv = Character.getNumericValue(input.charAt(i));
    		String binStr = Integer.toBinaryString(nv);
			int binStrLen = binStr.length();
			if(i > 0 && binStrLen < 3) {
				sb.append(binStrLen == 1 ? "00" : "0");
			}
			sb.append(binStr);
		}
    	
    	System.out.println(sb);
    }

}