import java.io.*;

//https://www.acmicpc.net/problem/4493
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int res = 0;
            
            while (n-- > 0) {
                String[] sp = br.readLine().split(" ");
                res += rpsPvP(sp[0], sp[1]);
            }
            
            if (res == 0) {
                sb.append("TIE\n");
                continue;
            }
            sb.append(res <= -1 ? "Player 1\n" : "Player 2\n");
        }
        
        System.out.print(sb);
    }
    
    // -1 (p1 win), 0 (draw), 1 (p2 win)
    private static int rpsPvP(String p1, String p2) {
        if        ("R".equals(p1) && "P".equals(p2)) {
            return  1;
        } else if ("R".equals(p1) && "S".equals(p2)) {
            return -1;
        } else if ("P".equals(p1) && "R".equals(p2)) {
            return -1;
        } else if ("P".equals(p1) && "S".equals(p2)) {
            return  1;
        } else if ("S".equals(p1) && "R".equals(p2)) {
            return  1;
        } else if ("S".equals(p1) && "P".equals(p2)) {
            return -1;
        }
        return 0;
    }

}