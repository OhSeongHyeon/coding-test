import java.io.*;

public class Main {
	
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	char[][] twoLevChArr = new char[5][];
        	int maxLen = 0;
        	for(int i = 0; i < 5; i++) {
        		twoLevChArr[i] = br.readLine().toCharArray();
        		if(maxLen < twoLevChArr[i].length) {
        			maxLen = twoLevChArr[i].length;
        		}
        	}
        	
        	StringBuilder sb = new StringBuilder();
        	int oneLevIdx = 0;
        	int twoLevIdx = 0;
        	while(true) {
        		while(true) {
        			if(twoLevIdx >= twoLevChArr.length) {
        				break;
        			}
        			if(oneLevIdx >= twoLevChArr[twoLevIdx].length) {
        				twoLevIdx++;
        				continue;
        			}
    				sb.append(twoLevChArr[twoLevIdx][oneLevIdx]);
    				twoLevIdx++;
        		}
        		if(twoLevIdx >= twoLevChArr.length && oneLevIdx > maxLen) {
        			break;
        		}
        		oneLevIdx++;
        		twoLevIdx = 0;
        	}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}