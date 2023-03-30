import java.io.*;

public class Main {
	
	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int rl = Integer.parseInt(br.readLine());
        	int check = rl;
        	for (int z = 1; z <= rl; z++) {
				char[] ca = br.readLine().toCharArray();
				boolean exitLoop = false;
				for (int i = 0; i < ca.length; i++) {
					char c = ca[i];
					if(i+1 < ca.length && c != ca[i+1]) {
						for (int j = i+1; j < ca.length; j++) {
							if(j+1 < ca.length && c == ca[j+1]) {
								check--;
								exitLoop = true;
								break;
							}
						}
					}
					if(exitLoop) break;
				}
			}
        	
        	bw.write(String.valueOf(check));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}