import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = br.readLine();
    	int len = input.length();
		int zeroGroupCnt = input.charAt(0) == '0' ? 1 : 0;
    	int oneGroupCnt = input.charAt(0) == '1' ? 1 : 0;
    	
    	for (int i = 1; i < len; i++) {
			char pre = input.charAt(i-1);
			char cur = input.charAt(i);
			if(pre == cur) {
				continue;
			}
			switch (pre) {
			case '0': oneGroupCnt++;
				break;
			case '1': zeroGroupCnt++;
				break;
			}
		}

    	System.out.println(Math.min(zeroGroupCnt, oneGroupCnt));
    }

}