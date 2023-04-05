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
        	String[] input = br.readLine().split(" ");
        	int move = Integer.parseInt(input[0]);
        	int back = Integer.parseInt(input[1]);
        	int goal = Integer.parseInt(input[2]);
        	int days = 0;
        	
        	if(move - back == 1) {
        		days = goal - back;
        	}else {
        		days = (goal-move) / (move-back);
        		if( (goal-move)%(move-back) == 0 ) {
            		days += 1;
        		}else {
            		days += 2;
        		}
        	}
        	
        	bw.write(String.valueOf(days));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}