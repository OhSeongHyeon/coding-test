import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String file1 = br.readLine();
        String file2 = br.readLine();
        if(n%2 == 0) {
        	System.out.println(file1.equals(file2) ? "Deletion succeeded" : "Deletion failed");
        	return;
        }
        int len = file1.length();
        
        for (int i = 0; i < len; i++) {
			char c1 = file1.charAt(i) == '0' ? '1' : '0';
			if(c1 != file2.charAt(i)) {
				System.out.println("Deletion failed");
				return;
			}
		}
        
        System.out.println("Deletion succeeded");
    }

}