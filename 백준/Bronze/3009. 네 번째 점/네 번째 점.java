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
        	int[] xArr = new int[3];
        	int[] yArr = new int[3];
        	for (int i = 0; i < 3; i++) {
        		String[] coordinate = br.readLine().split(" ");
        		xArr[i] = Integer.parseInt(coordinate[0]);
        		yArr[i] = Integer.parseInt(coordinate[1]);
			}
        	StringBuilder sb = new StringBuilder();
        	sb.append(xArr[findIdx(xArr)]).append(" ");
        	sb.append(yArr[findIdx(yArr)]);
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    private static int findIdx(int[] arr) {
    	int idx = 0;
    	for (int i = 1; i < arr.length; i++) {
    		if(arr[0] == arr[i]) {
    			if(i == 1) {
    				idx = 2;
    				break;
    			}
    			idx = 1;
    		}
		}
    	return idx;
    }
}