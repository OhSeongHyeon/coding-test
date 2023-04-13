import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	//백준 9063번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int crdnNum = Integer.parseInt(br.readLine());
        	if(crdnNum < 2) {
            	bw.write("0");
            	bw.flush();
        		return;
        	}
        	
        	int[] xArr = new int[crdnNum], yArr = new int[crdnNum];
        	
        	for(int i = 0; i < crdnNum; i++) {
        		String[] inp = br.readLine().split(" ");
        		xArr[i] = Integer.parseInt(inp[0]);
        		yArr[i] = Integer.parseInt(inp[1]);
        	}
        	
        	int xMin = xArr[0], xMax = xArr[0];
        	int yMin = yArr[0], yMax = yArr[0];
        	
        	for (int i = 1; i < crdnNum; i++) {
        		xMin = Math.min(xMin, xArr[i]);
        		xMax = Math.max(xMax, xArr[i]);
			}
        	for (int i = 1; i < crdnNum; i++) {
        		yMin = Math.min(yMin, yArr[i]);
        		yMax = Math.max(yMax, yArr[i]);
			}
        	
        	int rslt = (xMax-xMin) * (yMax-yMin);
        	
        	bw.write(String.valueOf(rslt));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}