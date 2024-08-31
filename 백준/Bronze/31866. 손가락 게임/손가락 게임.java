import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int j = Integer.parseInt(sp[0]);
		int i = Integer.parseInt(sp[1]);
		String res = "=";
		
		boolean junseongValid = isValid(j);
        boolean ikjunValid = isValid(i);

        if (!junseongValid && !ikjunValid) {
            res = "=";
        } else if (!junseongValid) {
            res = "<";
        } else if (!ikjunValid) {
            res = ">";
        } else if (j == i) {
            res = "=";
        } else if ((j == 0 && i == 2) || 
                   (j == 2 && i == 5) || 
                   (j == 5 && i == 0)) {
            res = ">";
        } else {
            res = "<";
        }

        System.out.println(res);
	}
	
	private static boolean isValid(int fingers) {
        return fingers == 0 || fingers == 2 || fingers == 5;
    }
	
}