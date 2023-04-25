import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	// 백준 
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int inp = Integer.parseInt(br.readLine());
        	boolean isFind = false;
        	for (int i = 1; i < inp; i++) {
        		int sum = i;
        		char[] ca = String.valueOf(i).toCharArray();
        		for (int j = 0; j < ca.length; j++) {
        			sum += Integer.parseInt(String.valueOf(ca[j]));
        		}
        		if(sum == inp) {
        			isFind = true;
        			bw.write(String.valueOf(i));
        			break;
        		}
			}
        	if(!isFind) {
        		bw.write("0");
        	}
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}