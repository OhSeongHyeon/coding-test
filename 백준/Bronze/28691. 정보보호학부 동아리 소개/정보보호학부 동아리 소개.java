import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        switch (br.readLine()) {
		case "M": System.out.println("MatKor");
			return;
		case "W": System.out.println("WiCys");
			return;
		case "C": System.out.println("CyKor");
			return;
		case "A": System.out.println("AlKor");
			return;
		case "$": System.out.println("$clear");
			return;
		}
    }

}