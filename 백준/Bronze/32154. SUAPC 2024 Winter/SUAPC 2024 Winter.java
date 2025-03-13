import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] scoreBoard = {
            {"11", "A B C D E F G H J L M"}
        ,   {"9", "A C E F G H I L M"}
        ,   {"9", "A C E F G H I L M"}
        ,   {"9", "A B C E F G H L M"}
        ,   {"8", "A C E F G H L M"}
        ,   {"8", "A C E F G H L M"}
        ,   {"8", "A C E F G H L M"}
        ,   {"8", "A C E F G H L M"}
        ,   {"8", "A C E F G H L M"}
        ,   {"8", "A B C F G H L M"}
        };
        int idx = n - 1;
        System.out.printf("%s\n%s", scoreBoard[idx][0], scoreBoard[idx][1]);
    }

}