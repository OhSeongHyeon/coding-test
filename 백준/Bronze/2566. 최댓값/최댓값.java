import java.io.*;

public class Main {
	
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int max = 0;
        	int row = 1, column = 1;
        	for (int i = 0; i < 9; i++) {
        		String inputLine = br.readLine();
        		String[] ila = inputLine.split(" ");
        		for (int j = 0; j < ila.length; j++) {
					int el = Integer.parseInt(ila[j]);
					if(max < el) {
						max = el;
						row = i+1;
						column = j+1;
					}
				}
			}
        	bw.write(String.format("%d\n%d %d", max, row, column));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}