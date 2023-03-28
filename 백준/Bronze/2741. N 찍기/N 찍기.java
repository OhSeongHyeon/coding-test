import java.io.*;

class Main {

	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int n = Integer.parseInt(br.readLine());
        	for (int i = 1; i <= n; i++) {
        		bw.write(String.valueOf(i+"\n"));
			}
			bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}