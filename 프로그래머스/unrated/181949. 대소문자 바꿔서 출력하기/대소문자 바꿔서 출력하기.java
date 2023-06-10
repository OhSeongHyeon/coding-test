import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ca = a.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if(Character.isLowerCase(ca[i])) {
                ca[i] = Character.toUpperCase(ca[i]);
            }else {
                ca[i] = Character.toLowerCase(ca[i]);
            }
        }
        System.out.println(ca);
    }
}