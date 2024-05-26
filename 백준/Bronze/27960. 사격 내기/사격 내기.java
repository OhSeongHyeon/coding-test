import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println(
            new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .findFirst()
                .map(line -> {
                    String[] sp = line.split("\\s");
                    return Integer.parseInt(sp[0]) ^ Integer.parseInt(sp[1]);
                })
                .orElse(0)
        );
	}

}