import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringBuilder sb = new StringBuilder();
            String line;

            while (!(line = br.readLine()).equals(".")) {
                boolean isBalanced = isBalanced(line);
                sb.append(isBalanced ? "yes\n" : "no\n");
            }

            bw.write(sb.toString());
            bw.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static boolean isBalanced(String line) {
        Stack<Character> stack = new Stack<>();
        for (char c : line.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == ')' || c == ']') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
