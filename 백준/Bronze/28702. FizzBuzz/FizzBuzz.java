import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rowNum = 3;

        while (rowNum-- > 0) {
            String s = br.readLine();

            if (isDigit(s)) {
                int res = Integer.parseInt(s) + rowNum + 1;
                System.out.println(whatTheFizzBuzz(res));
                return;
            }
        }

    }

    public static String whatTheFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0 && i % 5 != 0) {
            return "Fizz";
        } else if (i % 3 != 0 && i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }

    public static boolean isDigit(String s) {
        return s.chars().allMatch(Character::isDigit);
    }

}