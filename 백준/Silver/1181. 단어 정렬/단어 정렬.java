import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
            int tc = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            Set<String> words = new TreeSet<>();

            for (int i = 0; i < tc; i++) {
                words.add(br.readLine());
            }

        	words.stream()
                .sorted((w1, w2) -> Integer.compare(w1.length(), w2.length()))
                .forEach(w -> sb.append(w).append("\n"));

            bw.write(sb.toString());
            bw.flush();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}