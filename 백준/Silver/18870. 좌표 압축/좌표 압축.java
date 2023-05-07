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
            int[] codn = new int[tc];
            String[] inp = br.readLine().split("\\s");
            
            for (int i = 0; i < tc; i++) {
                codn[i] = Integer.parseInt(inp[i]);
            }
            
            int[] cmp = Arrays.stream(codn)
                .distinct()
                .sorted()
                .toArray();
            
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            
            for (int i = 0; i < cmp.length; i++) {
                map.put(cmp[i], i);
            }
            
            for (int i = 0; i < tc; i++) {
                sb.append(map.get(codn[i])).append(" ");
            }
            
            bw.write(sb.toString());
            bw.flush();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}