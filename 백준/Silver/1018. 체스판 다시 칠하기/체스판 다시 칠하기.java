import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] inp = br.readLine().split(" ");
        	final int N = Integer.parseInt(inp[0]);
        	final int M = Integer.parseInt(inp[1]);
        	boolean[][] inpBoard = new boolean[N][M]; // true = white, false = black
        	
        	for (int i = 0; i < N; i++) {
        		String rl = br.readLine();
        		for (int j = 0; j < M; j++) {
					if( rl.charAt(j) == 'B' ) {
						continue;
					}
					inpBoard[i][j] = true;
				}
			}
        	
        	int min = Integer.MAX_VALUE;
        	for (int r = 0; r < M-7; r++) {
        		for (int i = 0; i < N-7; i++) {
            		int planB = 0;
                	int planW = 0;
            		boolean isWhite = true;
        			for (int j = i; j < i+8; j++) {
        				for (int k = r; k < r+8; k++) {
        					if(inpBoard[j][k] == isWhite) {
        						planB++;
        					}else {
        						planW++;
        					}
        					if( k != r+7 ) {
        						isWhite = !isWhite;
        					}
        				}
        			}
        			min = Math.min(min, Math.min(planW, planB));
        		}
			}
        	
        	bw.write(String.valueOf(min));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}