import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(
            Arrays.toString(
                input.chars().collect(
                    () -> new int['z' - 'a' + 1],
                    (arr, c) -> arr[c - 'a']++,
                    (arr1, arr2) -> {}
                )
            ).replaceAll("[\\[\\],]", "")
        );
    }

}