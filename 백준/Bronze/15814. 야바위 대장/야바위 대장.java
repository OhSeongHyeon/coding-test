import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArr = br.readLine().toCharArray();
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0) {
        	String[] sp = br.readLine().split(" ");
        	int a = Integer.parseInt(sp[0]);
        	int b = Integer.parseInt(sp[1]);
        	char tmp = cArr[a];
        	cArr[a] = cArr[b];
        	cArr[b] = tmp;
        }
        
        System.out.println(cArr);
    }
}