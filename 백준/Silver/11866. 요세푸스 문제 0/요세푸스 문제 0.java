import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
            String[] split = br.readLine().split("\\s");
            Queue<Integer> queue = IntStream.rangeClosed(1, Integer.parseInt(split[0]))
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
            int k = Integer.parseInt(split[1]);
            StringBuilder sb = new StringBuilder("<");

            for(int loop = 1; !queue.isEmpty(); loop++) {
                if(loop%k == 0) {
                    sb.append(queue.poll()).append(queue.isEmpty() ? "" : ", ");
                    continue;
                }
                queue.offer(queue.poll());
            }

            bw.write(sb.append(">").toString());
            bw.flush();
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}