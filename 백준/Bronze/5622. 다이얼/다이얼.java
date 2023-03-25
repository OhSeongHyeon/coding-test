import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Main {
	
    public static void main(String[] args) {
    	Map<String, Integer> dialPad = dialPad();
    	try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
    		String[] strArr = br.readLine().split("");
    		int total = 0;
    		
    		for (String str : strArr) {
    			int padNum = dialPad.get(str);
    			total += padNum;
			}
    		total += strArr.length;
    		
    		bw.write(String.valueOf(total));
    		bw.flush();
    	}catch(IOException ioe) {
    		ioe.printStackTrace();
    	}
    }
    
    private static Map<String, Integer> dialPad() {
    	Map<String, Integer> dialPad = new HashMap<String, Integer>();
    	int[] ascii = IntStream.rangeClosed(65, 90).toArray();
    	int dialNum = 2;
    	
    	for (int i = 0; i < ascii.length; i++) {
			char c_alphabet = (char) ascii[i];
			String str_alphabet = String.valueOf(c_alphabet);
			dialPad.put(str_alphabet, dialNum);
			if( i < 15 && (i+1) % 3 == 0 ) {
				dialNum++;
			}else if( "S".equals(str_alphabet) || "V".equals(str_alphabet) ) {
				dialNum++;
			}
		}
    	
    	return dialPad;
    }
}