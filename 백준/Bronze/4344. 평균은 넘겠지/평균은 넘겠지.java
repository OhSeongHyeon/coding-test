import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int cn = Integer.parseInt(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	while(cn-- > 0) {
        		String[] cs = br.readLine().split(" ");
        		int ps = Integer.parseInt(cs[0]);
        		int sum = 0;
        		for (int i = 1; i < cs.length; i++) {
					sum += Integer.parseInt(cs[i]);
				}
        		float avg = sum/ps;
        		int cnt = 0;
        		for (int i = 1; i < cs.length; i++) {
        			float st = Float.parseFloat(cs[i]);
					if(st > avg) {
						cnt++;
					}
				}
        		float res = cnt * 100.0f / ps ;
        		sb.append(String.format("%.3f", res)).append("%\n");
        	}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}