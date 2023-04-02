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
        	int caseNum = Integer.parseInt(br.readLine());
        	
        	StringBuilder sb = new StringBuilder();
        	
        	for (int i = 0; i < caseNum; i++) {
        		int changeCent = Integer.parseInt(br.readLine());
        		int[] coinKinds = new int[4];
        		coinCounter(changeCent, coinKinds);
        		for (int j = 0; j < coinKinds.length; j++) {
					sb.append(coinKinds[j]).append(" ");
				}
        		sb.append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    private static void coinCounter(int cent, int[] coinKinds) {
    	if(cent < 1) {
    		return;
    	}
    	// cent
    	int quarter = 25;
    	int dime = 10;
    	int nickel = 5;
    	int penny = 1;
    	
    	if(cent >= quarter) {
    		cent -= quarter;
    		coinKinds[0]++;
    		coinCounter(cent, coinKinds);
    	}else if(quarter > cent && cent >= dime) {
    		cent -= dime;
    		coinKinds[1]++;
    		coinCounter(cent, coinKinds);
    	}else if(dime > cent && cent >= nickel) {
    		cent -= nickel;
    		coinKinds[2]++;
    		coinCounter(cent, coinKinds);
    	}else if(nickel > cent && cent >= penny) {
    		cent -= penny;
    		coinKinds[3]++;
    		coinCounter(cent, coinKinds);
    	}
    }
}