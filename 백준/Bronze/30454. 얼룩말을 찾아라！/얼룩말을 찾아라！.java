import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int n = Integer.parseInt(sp[0]);
        //int l = Integer.parseInt(sp[1]);
        long maxLine = Integer.MIN_VALUE;
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
			long lineCnt = Arrays.stream(br.readLine().split("0+"))
					.filter(a -> !a.isEmpty())
					.count();
			if(maxLine < lineCnt) {
				cnt = 1;
				maxLine = lineCnt;
			}else if(maxLine == lineCnt) {
				cnt++;
			}
		}
        
        System.out.println(maxLine + " " + cnt);
    }

}