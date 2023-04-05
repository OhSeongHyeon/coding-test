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
        	int input = Integer.parseInt(br.readLine());
        	if(input == 1) {
        		bw.write("1/1");
        		bw.flush();
        		return;
        	}
        	
        	int begin = 1;
        	int end = 1;
        	int loop = 1;
        	int direction = 1; // 양수 1행에서 시작, 음수 1열에서 시작
        	int numerator = 0;
        	int denominator = 0;
        	StringBuilder sb = new StringBuilder();
        	
        	while(true) {
        		begin += loop;
        		end += loop + 1;
        		loop++;
        		
        		if(input >= begin && input <= end) {
        			if(direction == 1) {
        				numerator = 1 + (input - begin);
            			denominator = loop - (input - begin);
            			break;
        			}
        			numerator = loop - (input - begin);
        			denominator = 1 + (input - begin);
        			break;
        		}
        		
        		direction = -direction;
        	}
        	
        	sb.append(numerator).append("/").append(denominator);
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}