import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int paperNum = Integer.parseInt(br.readLine());
        	boolean[][] canvas = new boolean[100][100];
        	
        	for (int i = 0; i < paperNum; i++) {
        		String[] input = br.readLine().split(" ");
        		int x = Integer.parseInt(input[0]);
        		int y = Integer.parseInt(input[1]);
        		
        		for (int j = x; j < x+10; j++) {
        			for (int k = y; k < y+10; k++) {
        				canvas[j][k] = true;
					}
				}
			}
        	
        	int area = 0;
        	for (int i = 0; i < canvas.length; i++) {
        		for (int j = 0; j < canvas.length; j++) {
        			if(canvas[i][j]) {
        				area++;
        			}
				}
			}
        	
        	bw.write(String.valueOf(area));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}