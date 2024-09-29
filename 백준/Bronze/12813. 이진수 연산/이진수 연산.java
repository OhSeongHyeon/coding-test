import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        int len = A.length();
        
        StringBuilder andRes = new StringBuilder();
        StringBuilder orRes = new StringBuilder();
        StringBuilder xorRes = new StringBuilder();
        StringBuilder notARes = new StringBuilder();
        StringBuilder notBRes = new StringBuilder();
        
        for (int i = 0; i < len; i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            
            andRes.append((a == '1' && b == '1') ? '1' : '0');
            orRes.append((a == '1' || b == '1') ? '1' : '0');
            xorRes.append((a != b) ? '1' : '0');
            notARes.append((a == '1') ? '0' : '1');
            notBRes.append((b == '1') ? '0' : '1');
        }
        
        System.out.printf("%s\n%s\n%s\n%s\n%s\n"
    		, andRes.toString()
    		, orRes.toString()
    		, xorRes.toString()
    		, notARes.toString()
    		, notBRes.toString()
		);
	}
	
}