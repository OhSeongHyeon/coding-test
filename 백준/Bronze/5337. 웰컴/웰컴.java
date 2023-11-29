public class Main {
    public static void main(String[] args) {
        String[] pattern = {
            ".  .   .",
            "|  | _ | _. _ ._ _  _",
            "|/\\|(/.|(_.(_)[ | )(/."
        };

        for (String line : pattern) {
            System.out.println(line);
        }
    }
}