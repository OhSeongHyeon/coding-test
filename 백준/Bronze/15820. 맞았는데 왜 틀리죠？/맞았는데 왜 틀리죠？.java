import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp1 = br.readLine().split("\\s+");
        int s1 = Integer.parseInt(sp1[0]);
        int s2 = Integer.parseInt(sp1[1]);
        
        if( !testCaseChecker(s1, br) ) {
        	System.out.println("Wrong Answer");
        	return;
        }
        
        if( !testCaseChecker(s2, br) ) {
        	System.out.println("Why Wrong!!!");
        	return;
        }
        
        System.out.println("Accepted");
    }
    
    private static boolean testCaseChecker(int loopTime, BufferedReader br) throws IOException {
    	for (int i = 0; i < loopTime; i++) {
        	String[] sp = br.readLine().split("\\s+");
        	int sub =  Integer.parseInt(sp[0]);
            int ans = Integer.parseInt(sp[1]);
            if(sub != ans) {
            	return false;
            }
		}
		return true;
	}

}