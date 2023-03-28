import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] input = br.readLine().split(" ");
        	int n = Integer.parseInt(input[0]);
        	int m = Integer.parseInt(input[1]);
        	int[][] matrix1 = createMatrix(br, new int[n][m], n, m);
        	int[][] matrix2 = createMatrix(br, new int[n][m], n, m);
        	StringBuilder sb = new StringBuilder();
        	
        	for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					sb.append(matrix1[i][j] + matrix2[i][j]);
					if( j == n-1 ) {
						sb.append("\n");
						continue;
					}
					sb.append(" ");
				}
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
	
	private static int[][] createMatrix(BufferedReader br, int[][] matrix, int n, int m) throws IOException{
    	for(int i = 0; i < n; i++) {
    		String[] rl = br.readLine().split(" ");
    		for(int j = 0; j < m; j++) {
    			int el = Integer.parseInt(rl[j]);
    			matrix[i][j] = el;
    		}
    	}
		return matrix;
	}
}